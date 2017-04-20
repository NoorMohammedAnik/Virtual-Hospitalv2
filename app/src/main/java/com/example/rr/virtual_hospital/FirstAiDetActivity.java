package com.example.rr.virtual_hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstAiDetActivity extends AppCompatActivity {
    ImageView place_img;
    TextView dis_name, dis_desc, dis_sym, what_to_do;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_ai_det);
        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("First Aid Details List");


        place_img = (ImageView) findViewById(R.id.place_img);
        dis_name = (TextView) findViewById(R.id.dsesName);
        dis_desc = (TextView) findViewById(R.id.desesDesptn);
        dis_sym = (TextView) findViewById(R.id.symtms);
        what_to_do = (TextView) findViewById(R.id.whtToDO);

        String getDocName = getIntent().getExtras().getString("docName");

        if (getDocName.equals("AAA (Abdominal Aortic Aneurysm)")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            dis_name.setText(getDocName);
            dis_desc.setText("An abdominal aortic aneurysm is an enlarged area in the lower part of the aorta, the major blood vessel that supplies blood to the body. The aorta, about the thickness of a garden hose, runs from your heart through the center of your chest and abdomen.");
            dis_sym.setText("    Sudden, intense and persistent abdominal or back pain, which can be described as a tearing sensation.\n" +
                    "    Pain that radiates to your back or legs.\n" +
                    "    Sweatiness.\n" +
                    "    Clamminess.\n" +
                    "    Dizziness.\n" +
                    "    Nausea.\n" +
                    "    Vomiting.\n" +
                    "    Low blood pressure.");
            what_to_do.setText("\n" +
                    "\n" +
                    "Focusing on heart health can prevent an AAA. This means watching what you eat, exercising, and avoiding other cardiovascular risk factors such as smoking. Your doctor might also prescribe medicines to treat high blood pressure or cholesterol or to help you control your diabetes.\n" +
                    "\n" +
                    "Your doctor may want to screen you for an AAA when you turn 65 if you’re at a higher risk due to smoking and other factors. The screening test uses an abdominal ultrasound to scan your aorta for bulges. It’s painless and only needs to be performed once.\n");

        }


        if (getDocName.equals("Adenomyosis (Uterine Fibroids)")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            dis_name.setText(getDocName);
            dis_desc.setText("Adenomyosis is a condition in which the inner lining of the uterus (the endometrium) breaks through the muscle wall of the uterus (the myometrium). Adenomyosis can cause menstrual cramps, lower abdominal pressure, and bloating before menstrual periods and can result in heavy periods. The condition can be located throughout the entire uterus or localized in one spot.");
            dis_sym.setText("\n" +
                    "    Heavy, prolonged menstrual bleeding\n" +
                    "    Severe menstrual cramps\n" +
                    "    Abdominal pressure and bloating\n");
            what_to_do.setText("Anti-inflammatory drugs. If you're nearing menopause, your doctor may have you try anti-inflammatory medications, such as ibuprofen (Advil, Motrin, others), to control the pain. By starting an anti-inflammatory medicine two to three days before your period begins and continuing to take it during your period, you can reduce menstrual blood flow in addition to relieving pain.\n" +
                    "Hormone therapy. Controlling your menstrual cycle through combined estrogen-progestin oral contraceptives, hormone-containing patches or vaginal rings may lessen the heavy bleeding and pain associated with adenomyosis. Progestin-only contraception, such as an intrauterine device containing progestin or a continuous-use birth control pill, often leads to amenorrhea - the absence of your menstrual periods - which may provide relief.\n" +
                    "Presacral Neurectomy.  A surgical procedure to interrupt the pain nerve supply, or presacral nerve plexus, to the uterus.");

        }

        if (getDocName.equals("Adult Acne (Rosacea)")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            dis_name.setText(getDocName);
            dis_desc.setText("Rosacea is a common disorder that most usually affects facial skin. It causes redness on the nose, chin, cheeks, and forehead. ... In some cases, rosacea can appear on the chest, ears, neck, or scalp. If rosacea is not treated, red solid bumps and pus-filled pimples can develop.");
            dis_sym.setText("Frequent flushing of your face, similar to blushing. This is often the first symptom and may be the only symptom for months or years before anything else develops.\n" +
                    "Redness (erythema) of parts of the face. This can look similar to sunburn.\n" +
                    "Small lumpy red spots (papules) and small cysts (pustules) on your face. The spots and cysts look similar to acne. These may come and go in some cases but, in others, remain long-term unless treated.\n" +
                    "Tiny blood vessels visible on your face. This is also called telangectasia. They can sometimes become quite prominent on your face.");
            what_to_do.setText("Avoid strong sunlight to the face. Sunlight is thought to make symptoms worse. Use a sunblock cream on the face regularly, with a high protection factor (30 or higher and with ultraviolet A (UVA) and ultraviolet B (UVB) protection). It is difficult to say what is strong sunlight. Therefore, many doctors would advise that you apply sunblock every day before you go out, whatever the level of sunshine. A wide-brimmed hat will also help to protect your face from the sun.");

        }


        if (getDocName.equals("Adult-Onset Asthma")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            dis_name.setText(getDocName);
            dis_desc.setText(" Asthma is a disorder of the lungs that causes intermittent symptoms. In the airways there is:\n" +
                    "\n" +
                    "    Swelling or inflammation, specifically in the airway linings\n" +
                    "    Production of large amounts of mucus that is thicker than normal\n" +
                    "    Narrowing because of muscle contractions surrounding the airways\n");
            dis_sym.setText("\n" +
                    "    Feeling short of breath\n" +
                    "    Frequent coughing, especially at night\n" +
                    "    Wheezing (a whistling noise during breathing)\n" +
                    "    Difficulty breathing\n" +
                    "    Chest tightness\n");
            what_to_do.setText("Asthma can be controlled, but there's no asthma cure. There are certain goals in asthma treatment. If you are unable to achieve all of these goals, it means asthma is not in good control. You should contact your asthma care provider for help with asthma.");

        }

        if (getDocName.equals("Back Pain (Low Back Pain)")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            dis_name.setText(getDocName);
            dis_desc.setText(" Lower back pain, often accompanied by leg pain, which worsens when standing or walking for long periods. ... This pain may be caused by lumbar spinal stenosis and/or degenerative spondylolisthesis.");
            dis_sym.setText("Fever and chills\n" +
                    "Unexplained recent weight loss\n" +
                    "Significant leg weakness\n" +
                    "Sudden bowel and/or bladder incontinence—either difficulty passing urine or having a bowel movement, or loss of control of urination or bowel movement (cauda equina syndrome)");
            what_to_do.setText("xercise your core. Strong core muscles are important to provide support for the lower back and avoid injury. Low-impact cardiovascular exercise—like exercise walking—increases blood flow to the spine, which supplies healing nutrients and hydration to the structures in your lower back.");

        }

        if (getDocName.equals("Bad Breath")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            dis_name.setText(getDocName);
            dis_desc.setText("Bad breath is usually caused by poor oral hygiene habits, infections that occur in the mouth, unhealthy habits, such as smoking and alcohol intake, and foods that you eat");
            dis_sym.setText("Bad breath odors vary, depending on the source or the underlying cause. Some people worry too much about their breath, even though they have little or no mouth odor, while others have bad breath and don't know it. The underlying symptoms can be poor oral hygiene caused by the dental plaque, food debris and development of gingivitis. Because it's difficult to assess how your own breath smells, try to smell your breath by placing your hand over your nose and mouth and breath, ask a relative, and consider seeing a dental professional to confirm if bad breath is an issue for you and to ask how to treat it.");
            what_to_do.setText("Treatment depends on the cause and varies among patients. Bad breath can often be combated by drinking lots of water every day and maintaining good oral hygiene.");

        }

        if (getDocName.equals("Bath Salts Abuse and Addiction")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            dis_name.setText(getDocName);
            dis_desc.setText("The drugs widely sold as bath salts, and other similar names, are alleged to produce dramatic effects in their users. Perhaps one of the most famous incidents of apparent bath salt abuse involved a spate of horrific attacks, including cannibalism.\n" +
                    "\n" +
                    "These instances were widely reported as being caused by these drugs, but after further information was unveiled, there was no evidence of bath salt abuse found in these cases. As a result, these drugs were widely maligned with little real evidence, and numerous myths have sprung up about their use. The facts about bath salts are disturbing on their own, but further investigation found that there was no evidence they cause \"zombie-like\" behavior.");
            dis_sym.setText("    Psychosis.\n" +
                    "    Dizziness.\n" +
                    "    Heart problems.\n" +
                    "    Malnutrition.\n" +
                    "    Ulcers.\n" +
                    "    Mood disorders.\n" +
                    "    Total loss of coordination.");
            what_to_do.setText("Once an addiction has been identified, it's best to talk to the person. The key is to persuade your loved one to get help. Aim to understand why the addiction happened and don't take anything personally; the drugs may well be talking, not the person you love.");

        }

        if (getDocName.equals("Behcet's Syndrome")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            dis_name.setText(getDocName);
            dis_desc.setText("Behcet's (beh-CHETS) disease, also called Behcet's syndrome, is a rare disorder that causes blood vessel inflammation throughout your body. The disease can lead to numerous signs and symptoms that may seem unrelated at first. They may include mouth sores, eye inflammation, skin rashes and lesions, and genital sores");
            dis_sym.setText("Areas commonly affected by Behcet's disease include:\n" +
                    "\n" +
                    "    Mouth. Painful mouth sores that look similar to canker sores are the most common sign of Behcet's disease. They begin as raised, round lesions in the mouth that quickly turn into painful ulcers. The sores usually heal in one to three weeks, though they do recur.\n" +
                    "    Skin. Skin problems can vary. Some people may develop acne-like sores on their bodies. Others may develop red, raised and tender nodules on their skin, especially on the lower legs.\n" +
                    "    Genitals. People with Behcet's disease may develop sores on their genitals. The red, open sores commonly occur on the scrotum or the vulva. The sores are usually painful and may leave scars.\n" +
                    "    Eyes. Behcet's disease may cause inflammation in the eye — a condition called uveitis (u-vee-I-tis). Uveitis causes redness, pain and blurred vision in one or both eyes. In people with Behcet's disease, the condition and may come and go.\n" +
                    "    Joints. Joint swelling and pain often affect the knees in people with Behcet's disease. The ankles, elbows or wrists also may be involved. Signs and symptoms may last one to three weeks and go away on their own.\n" +
                    "    Vascular system. Inflammation in blood vessels (veins and arteries) may occur in Behcet's disease, causing redness, pain, and swelling in the arms or legs when a blood clot results. Inflammation in the large arteries can lead to complications, such as aneurysms and narrowing or blockage of the vessel.\n" +
                    "    Digestive system. Behcet's disease may cause a variety of signs and symptoms that affect the digestive system, including abdominal pain, diarrhea and bleeding.\n" +
                    "    Brain. Behcet's disease may cause inflammation in the brain and nervous system that leads to headache, fever, disorientation, poor balance or stroke.\n");
            what_to_do.setText("Make an appointment with your doctor if you notice any unusual signs and symptoms that might indicate Behcet's disease. If you've been diagnosed with Behcet's disease, see your doctor if you notice any new signs and symptoms.");

        }


            if (getDocName.equals("Black Eye")) {

        place_img.setImageResource(R.drawable.diaforlisdet);
        dis_name.setText(getDocName);
        dis_desc.setText("A black eye, periorbital hematoma, or shiner, is bruising around the eye commonly due to an injury to the face rather than to the eye. The name is given due to the color of bruising. The so-called black eye is caused by bleeding beneath the skin and around the eye.");
        dis_sym.setText("The symptoms of a black eye include bruising and swelling of the eyelid and soft tissue around the injured eye, sometimes accompanied by broken blood vessels along the white of the eye called subconjunctival haemorrhage. The discoloration starts out deep purple or blue. As the bruise resolves, it may turn green or yellow before disappearing.");
        what_to_do.setText("Switch to warm. After a day or two of applying cold packs, try gently applying warm (not hot) compresses to your black eye. This will increase blood flow to the area to facilitate healing. Gently massage the area surrounding the bruise (not the black eye itself) in the days following the injury.");

    }
        if (getDocName.equals(" ")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("");
            dis_sym.setText("");
            what_to_do.setText("");

        }


        if (getDocName.equals(" ")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("");
            dis_sym.setText("");
            what_to_do.setText("");

        }

        if (getDocName.equals(" ")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("");
            dis_sym.setText("");
            what_to_do.setText("");

        }

        if (getDocName.equals(" ")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("");
            dis_sym.setText("");
            what_to_do.setText("");

        }

        if (getDocName.equals(" ")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("");
            dis_sym.setText("");
            what_to_do.setText("");

        }

        if (getDocName.equals(" ")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("");
            dis_sym.setText("");
            what_to_do.setText("");

        }

        if (getDocName.equals(" ")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("");
            dis_sym.setText("");
            what_to_do.setText("");

        }

        if (getDocName.equals(" ")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("");
            dis_sym.setText("");
            what_to_do.setText("");

        }

        if (getDocName.equals(" ")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("");
            dis_sym.setText("");
            what_to_do.setText("");

        }

        if (getDocName.equals(" ")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("");
            dis_sym.setText("");
            what_to_do.setText("");

        }

        if (getDocName.equals(" ")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("");
            dis_sym.setText("");
            what_to_do.setText("");

        }

        if (getDocName.equals(" ")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("");
            dis_sym.setText("");
            what_to_do.setText("");

        }

        if (getDocName.equals(" ")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("");
            dis_sym.setText("");
            what_to_do.setText("");

        }

        if (getDocName.equals(" ")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("");
            dis_sym.setText("");
            what_to_do.setText("");

        }




    }

    //for back button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
