package com.example.rr.virtual_hospital.maps.google_maps_class;

import android.os.AsyncTask;
import android.util.Log;

import com.google.android.gms.maps.GoogleMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadTask extends AsyncTask<Object, Void, String> {
	GoogleMap googleMap;

	// Downloading data in non-ui thread
	@Override
	protected String doInBackground(Object... objects) {

		// For storing data from web service
		String data = "";

		try {
			// Fetching the data from web service
			data = downloadUrl((String) objects[1]);
			googleMap = (GoogleMap) objects[0];
		} catch (Exception e) {
			Log.d("Background Task", e.toString());
		}
		return data;
	}

	// Executes in UI thread, after the execution of
	// doInBackground()
	@Override
	protected void onPostExecute(String result) {
		super.onPostExecute(result);

		ParserTask parserTask = new ParserTask();
		Object[] toPass = new Object[3];
		toPass[0] = googleMap;
		toPass[1] = result;
		// Invokes the thread for parsing the JSON data
		parserTask.execute(toPass);
	}

	private String downloadUrl(String strUrl) throws IOException {
		String data = "";
		InputStream iStream = null;
		HttpURLConnection urlConnection = null;
		try {
			URL url = new URL(strUrl);
			// Creating an http connection to communicate with url
			urlConnection = (HttpURLConnection) url.openConnection();
			// Connecting to url
			urlConnection.connect();
			// Reading data from url
			iStream = urlConnection.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(
					iStream));
			StringBuffer sb = new StringBuffer();
			String line = "";
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			data = sb.toString();
			br.close();

		} catch (Exception e) {
			Log.d("Exception", e.toString());
		} finally {
			iStream.close();
			urlConnection.disconnect();
		}
		return data;
	}
}