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
        if (getDocName.equals("Branchial Cyst")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("A branchial cleft cyst is a congenital epithelial cyst that arises on the lateral part of the neck usually due to failure of obliteration of the second branchial cleft (or failure of fusion of the second and third branchial arches) in embryonic development.");
            dis_sym.setText("A branchial cleft cyst usually doesn’t cause pain unless there’s infection. The signs of a branchial cleft cyst include:\n" +
                    "\n" +
                    "    A dimple, lump, or skin tag on your child’s neck, upper shoulder, or slightly below their collarbone\n" +
                    "    Fluid draining from your child’s neck\n" +
                    "    Swelling or tenderness in your child’s neck, which usually occurs with an upper respiratory infection\n");
            what_to_do.setText("Your child’s doctor will likely prescribe antibiotics if your child has signs of infection. It may be necessary to drain fluid from the cyst to ease swelling. To prevent future infections, doctors usually recommend surgery to remove the cyst.");

        }


        if (getDocName.equals("Breast Lumps In Women")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("Breast lumps can be caused by infections, injuries, non-cancerous growths, and cancer. Breast cancer usually causes no pain in the breast. The symptoms of breast cancer include painless breast lumps, nipple discharge, and inflammation of the skin of the breast. ... The treatment of a breast lump depends on its cause");
            dis_sym.setText("There are many possible causes for a lump in your breast, including:\n" +
                    "\n" +
                    "    breast cysts, which are soft, fluid-filled sacs\n" +
                    "    milk cysts, referring to sacs filled with milk that can occur during breast-feeding\n" +
                    "    fibrocystic breasts, a condition in which breast tissue feels lumpy in texture and is sometimes accompanied by pain\n" +
                    "    fibroadenoma, meaning noncancerous rubbery lumps that move easily within the breast tissue and rarely become cancerous\n" +
                    "    hamartoma, which is a benign, tumorlike growth\n" +
                    "    intraductal papilloma, referring to a small, non-cancerous tumor in a milk duct\n" +
                    "    lipoma, which is a slow-growing, noncancerous, fatty lump\n" +
                    "    mastitis, or an infection of the breast\n" +
                    "    injury\n" +
                    "    breast cancer");
            what_to_do.setText("Your doctor must determine the cause of your breast lump before he or she can formulate a treatment plan. Not all breast lumps will need treatment.\n" +
                    "\n" +
                    "If you have a breast infection, your doctor will probably prescribe antibiotics to treat it. If you have a cyst, it can be drained of fluids. Usually, cysts go away after they’re drained. In some cases, cysts do not need to be treated and may disappear on their own.\n" +
                    "\n" +
                    "If the lump is found to be breast cancer, treatment can include:\n" +
                    "\n" +
                    "    lumpectomy, or removing the lump\n" +
                    "    mastectomy, which refers to removing your breast tissue\n" +
                    "    chemotherapy, which uses drugs to fight or destroy the cancer\n" +
                    "    radiation, a treatment that uses radioactive rays or materials to fight the cancer");

        }

        if (getDocName.equals("Calcium, Elevated (Hypercalcemia)")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("Hypercalcemia is a condition in which the calcium level in your blood is above normal. Too much calcium in your blood can weaken your bones, create kidney stones, and interfere with the way your heart and brain works. Hypercalcemia most commonly results from overactive parathyroid glands");
            dis_sym.setText("ou might not have any symptoms if you have mild hypercalcemia. If you have a more serious case, you might have symptoms that affect various parts of your body.\n" +
                    "Kidneys \n" +
                    "\n" +
                    "Symptoms related to your kidneys can lead to: \n" +
                    "\n" +
                    "    excessive thirst\n" +
                    "    excessive urination\n" +
                    "    pain between your back and upper abdomen on one side\n" +
                    "\n" +
                    "Abdomen \n" +
                    "\n" +
                    "Symptoms related to the abdomen include: \n" +
                    "\n" +
                    "    nausea\n" +
                    "    abdominal pain\n" +
                    "    decreased appetite\n" +
                    "    constipation\n" +
                    "    vomiting\n" +
                    "\n" +
                    "Muscles \n" +
                    "\n" +
                    "Calcium levels can affect your muscles, causing twitches and weakness.\n" +
                    "Skeletal System \n" +
                    "\n" +
                    "High calcium levels can also cause bone issues, including: \n" +
                    "\n" +
                    "    bone pain\n" +
                    "    height loss\n" +
                    "    bowed shoulders\n" +
                    "    curvature of the spine\n" +
                    "    fractures from disease \n" +
                    "\n" +
                    "Psychological Symptoms\n" +
                    "\n" +
                    "Hypercalcemia can also cause psychological symptoms, such as depression, memory loss, and irritability. \n" +
                    "\n" +
                    "If you have cancer and experience any symptoms of hypercalcemia, call your doctor immediately. Hypercalcemia is a medical emergency in people who have cancer. ");
            what_to_do.setText("Mild Cases\n" +
                    "\n" +
                    "If you have mild hypercalcemia, your doctor might suggest simply keeping track of your condition and waiting to see if it improves or gets worse on its own.\n" +
                    "Severe Cases\n" +
                    "\n" +
                    "You might need hospital treatment if you have a severe case. The goal of treatment is to return your calcium level to normal. Treatment also aims to prevent damage to your bones and kidneys. Treatment options include the following:\n" +
                    "\n" +
                    "    Calcitonin is a hormone produced in the thyroid gland. It slows down bone loss.\n" +
                    "    Intravenous fluids keep you hydrated.\n" +
                    "    Corticosteroids are anti-inflammatory medications. They help your body handle having too much vitamin D.\n" +
                    "    Loop diuretic medications can help your kidneys function and get rid of extra calcium.\n" +
                    "    Intravenous bisphosphonates can keep your bones from breaking down.\n" +
                    "    Dialysis can be given to rid your blood of extra calcium and waste when you have damaged kidneys. This is only done if other treatment methods aren’t working.\n");

        }

//        if (getDocName.equals("CBC (Complete Blood Count) ")) {
//
//            place_img.setImageResource(R.drawable.diaforlisdet);
//            dis_name.setText(getDocName);
//            dis_desc.setText("\n" +
//                    "\n" +
//                    "A complete blood count (CBC) is a blood test used to evaluate your overall health and detect a wide range of disorders, including anemia, infection and leukemia.\n" +
//                    "\n" +
//                    "A complete blood count test measures several components and features of your blood, including:\n" +
//                    "\n" +
//                    "    Red blood cells, which carry oxygen\n" +
//                    "    White blood cells, which fight infection\n" +
//                    "    Hemoglobin, the oxygen-carrying protein in red blood cells\n" +
//                    "    Hematocrit, the proportion of red blood cells to the fluid component, or plasma, in your blood\n" +
//                    "    Platelets, which help with blood clotting\n" +
//                    "\n" +
//                    "Abnormal increases or decreases in cell counts as revealed in a complete blood count may indicate that you have an underlying medical condition that calls for further evaluation.\n");
//            dis_sym.setText("");
//            what_to_do.setText("");
//
//        }

        if (getDocName.equals("Cellulite")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("The condition is characterized by fat deposits under the skin that cause an uneven, lumpy, dimpled appearance. Cellulite is more common in women and usually occurs in a localized area of the body, such as on the stomach, thighs, hips, and buttocks");
            dis_sym.setText("Signs of cellulite are relatively easy to recognize. The condition is characterized by fat deposits under the skin that cause an uneven, lumpy, dimpled appearance.\n" +
                    "\n" +
                    "Cellulite is more common in women and usually occurs in a localized area of the body, such as on the stomach, thighs, hips, and buttocks. It also can occur in other areas, including the breasts, upper arms, back, and neck.\n" +
                    "\n" +
                    "Areas of the body affected by cellulite often are described as resembling cottage cheese or an orange peel. In mild cases, the dimpling only is noticeable when the skin is pinched or compressed. Other symptoms include thickened skin, a cool feel to the skin, and broken blood vessels. ");
            what_to_do.setText("Several machines have been introduced that massage the areas affected by cellulite. These machines use rolling cylinders to gather areas of skin and massage them inside a chamber. One example of massage treatments is Endermologie, which was developed in France and has been used for cellulite treatment since the mid-1990s. This technique uses an electrically powered device that suctions, pulls, and squeezes affected areas. Treatments are expensive and typically last for 30-45 minutes. Ten to 12 treatments are typically required before results are noticeable. Endermologie has been approved by the U.S. FDA for temporary reduction in the appearance of cellulite. While a temporary decrease in the appearance of cellulite may occur, the technique appears to redistribute fat rather than permanently alter its configuration under the skin. Regular maintenance treatments are required after the initial effect has been achieved or the cellulite will return.");

        }

        if (getDocName.equals("Chronic Cough")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("A chronic cough is a cough that lasts eight weeks or longer in adults, or four weeks in children. A chronic cough is more than just an annoyance. ... While it can sometimes be difficult to pinpoint the problem that's triggering a chronic cough, the most common causes are tobacco use, postnasal drip, asthma and acid reflux.");
            dis_sym.setText("A chronic cough can occur with other signs and symptoms, which may include:\n" +
                    "\n" +
                    "    A runny or stuffy nose\n" +
                    "    A feeling of liquid running down the back of your throat (postnasal drip)\n" +
                    "    Frequent throat clearing and sore throat\n" +
                    "    Hoarseness\n" +
                    "    Wheezing and shortness of breath\n" +
                    "    Heartburn or a sour taste in your mouth\n" +
                    "    In rare cases, coughing up blood\n");
            what_to_do.setText("    Antihistamines, glucocorticoids and decongestants. These drugs are standard treatment for allergies and postnasal drip.\n" +
                    "    Inhaled asthma drugs. ...\n" +
                    "    Antibiotics. ...\n" +
                    "    Acid blockers. ...\n" +
                    "    Cough suppressants.");

        }

        if (getDocName.equals("Conjunctivitis (Pink Eye) ")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("Pink eye (conjunctivitis) is an inflammation or infection of the transparent membrane (conjunctiva) that lines your eyelid and covers the white part of your eyeball. ... Pink eye is commonly caused by a bacterial or viral infection or an allergic reaction.");
            dis_sym.setText("    Redness in the white of the eye or inner eyelid.\n" +
                    "    Increased amount of tears.\n" +
                    "    Thick yellow discharge that crusts over the eyelashes, especially after sleep.\n" +
                    "    Green or white discharge from the eye.\n" +
                    "    Itchy eyes.\n" +
                    "    Burning eyes.\n" +
                    "    Blurred vision.\n" +
                    "    Increased sensitivity to light.");
            what_to_do.setText("Home treatment for pinkeye will help reduce your pain and keep your eye free of drainage. If you wear contacts, remove them and wear glasses until your symptoms have gone away completely. Thoroughly clean your contacts and storage case.\n" +
                    "\n" +
                    "Cold compresses or warm compresses (whichever feels best) can be used. If an allergy is the problem, a cool compress may feel better. If the pinkeye is caused by an infection, then a warm, moist compress may soothe your eye and help reduce redness and swelling. Warm, moist compresses can spread infection from one eye to the other. Use a different compress for each eye, and use a clean compress for each application.");

        }

        if (getDocName.equals("Deafness")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("Hearing loss refers to a diminished ability to hear sounds like other people do, while deafness refers to the inability to understand speech through hearing even when sound is amplified. Profound deafness means the person cannot hear anything at all; they are unable to detect sound, even at the highest volume possible.");
            dis_sym.setText("Signs and symptoms of hearing loss may include:\n" +
                    "\n" +
                    "    Muffling of speech and other sounds\n" +
                    "    Difficulty understanding words, especially against background noise or in a crowd of people\n" +
                    "    Trouble hearing consonants\n" +
                    "    Frequently asking others to speak more slowly, clearly and loudly\n" +
                    "    Needing to turn up the volume of the television or radio\n" +
                    "    Withdrawal from conversations\n" +
                    "    Avoidance of some social settings\n");
            what_to_do.setText("Types of conductive hearing loss include congenital absence of ear canal or failure of the ear canal to be open at birth, congenital absence, malformation, or dysfunction of the middle ear structures, all of which may possibly be surgically corrected. If these are not amenable to successful surgical correction, then the hearing alternatively may be improved with amplification with a bone conduction hearing aid, or a surgically implanted, osseointegrated device (for example, the Baha or Ponto System), or a conventional hearing aid, depending on the status of the hearing nerve.");

        }

        if (getDocName.equals("Dehydration")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("Dehydration occurs when you use or lose more fluid than you take in, and your body doesn't have enough water and other fluids to carry out its normal functions. If you don't replace lost fluids, you will get dehydrated.");
            dis_sym.setText("    Increased thirst.\n" +
                    "    Dry mouth.\n" +
                    "    Tired or sleepy.\n" +
                    "    Decreased urine output.\n" +
                    "    Urine is low volume and more yellowish than normal.\n" +
                    "    Headache.\n" +
                    "    Dry skin.\n" +
                    "    Dizziness.");
            what_to_do.setText("1. Replace Fluids. For mild dehydration or while waiting for medical care for an adult with severe dehydration that is not due to heat stroke: The person should try to drink 2 quarts of fluid, such as water, juice, or sports drinks (clear fluids, best), in 2 to 4 hours.");

        }

        if (getDocName.equals("Dengue Fever ")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("Dengue fever is a disease caused by a family of viruses that are transmitted by mosquitoes. Symptoms of dengue fever include severe joint and muscle pain, swollen lymph nodes, headache, fever, exhaustion, and rash. The presence of fever, rash, and headache (the \"dengue triad\") is characteristic of dengue fever.");
            dis_sym.setText("    Sudden, high fever.\n" +
                    "    Severe headaches.\n" +
                    "    Pain behind the eyes.\n" +
                    "    Severe joint and muscle pain.\n" +
                    "    Fatigue.\n" +
                    "    Nausea.\n" +
                    "    Vomiting.\n" +
                    "    Skin rash, which appears two to five days after the onset of fever.");
            what_to_do.setText("Treatment for Dengue Fever. There is no specific medicine to treat dengue infection. If you think you may have dengue fever, you should use pain relievers with acetaminophen and avoid medicines with aspirin, which could worsen bleeding. You should also rest, drink plenty of fluids, and see your doctor.");

        }

        if (getDocName.equals("Diarrhea")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("Diarrhea, also spelled diarrhoea, is the condition of having at least three loose or liquid bowel movements each day. It often lasts for a few days and can result in dehydration due to fluid loss. Signs of dehydration often begin with loss of the normal stretchiness of the skin and irritable behaviour.");
            dis_sym.setText(" Diarrhea occurs because more fluid passes through the large intestine (colon) than that organ can absorb. As a rule, the colon can absorb several times more fluid than is required on a daily basis. However, when this reserve capacity is overwhelmed, diarrhea occurs.\n" +
                    "\n" +
                    "Diarrhea is caused by infections or illnesses that either lead to excess production of fluids or prevent absorption of fluids. Also, certain substances in the colon, such as fats and bile acids, can interfere with water absorption and cause diarrhea. Rapid passage of material through the colon can also do the same.\n" +
                    "\n" +
                    "Symptoms related to any diarrheal illness are often those associated with any injury to the gastrointestinal tract, such as fever , nausea , vomiting , and abdominal pain . All or none of these may be present depending on the disease causing the diarrhea. The number of bowel movements can vary—up to 20 or more per day. In some persons, blood or pus is present in the stool. Bowel movements may be difficult to flush (float) or contain undigested food material.\n" +
                    "\n" +
                    "The most common causes of acute diarrhea are infections (the cause of traveler's diarrhea), food poisoning , and medications. Medications are a frequent and often over-looked cause, especially antibiotics and antacids. Less often, various sugar-free foods, which sometimes contain poorly absorbable materials, cause diarrhea.\n" +
                    "\n" +
                    "Chronic diarrhea is frequently due to many of the same things that cause the shorter episodes (infections, medications, etc.); however, symptoms last longer. Some infections can become chronic. This occurs mainly with parasitic infections (such as Giardia ) or when people have altered immunity (such as AIDS ). In children, more common causes of chronic diarrhea are food allergy and lactose intolerance . Toddlers who drink too much juice can have frequent, loose stools.\n" +
                    "\n" +
                    "Read more: http://www.healthofchildren.com/D/Diarrhea.html#ixzz4enFplItd\n");
            what_to_do.setText("\n" +
                    "    Take frequent, small sips of water or a rehydration drink and small bites of salty crackers.\n" +
                    "        Try to increase your fluid intake to at least 1 qt (1 L) per hour for 1 to 2 hours, or longer if you keep having large amounts of diarrhea. Note: If you have kidney, heart, or liver disease and have to limit fluids, talk with your doctor before you increase the amount of fluids you drink. \n" +
                    "    Begin eating mild foods the next day or sooner, depending on how you feel.\n" +
                    "        Avoid spicy foods, fruits, alcohol, and caffeine until 48 hours after all symptoms have disappeared.\n" +
                    "        Avoid chewing gum that contains sorbitol.\n" +
                    "        Avoid milk for 3 days after symptoms disappear. You can eat cheese or yogurt with probiotics.\n");

        }

        if (getDocName.equals("Diarrhea, Travelers (Traveler's Diarrhea)")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("Traveler's diarrhea is a digestive tract disorder that commonly causes loose stools and abdominal cramps. It's caused by eating contaminated food or drinking contaminated water. ... ");
            dis_sym.setText("Abrupt onset of diarrhea\n" +
                    "Fever\n" +
                    "Nausea and vomiting\n" +
                    "Bloating\n" +
                    "Urgent need to have a bowel movement\n" +
                    "Malaise (weakness or discomfort)\n" +
                    "Explosive and painful gas\n" +
                    "Cramps\n" +
                    "Loss of appetite");
            what_to_do.setText("\n" +
                    "\n" +
                    "    Anti-motility agents. These medications) — which include loperamide (Imodium A-D) and drugs containing diphenoxylate (Lomotil, Lonox) — provide prompt but temporary relief by reducing muscle spasms in your gastrointestinal tract, slowing the transit time through your digestive system and allowing more time for absorption.\n" +
                    "\n" +
                    "    Anti-motility medications aren't recommended for infants or people with a fever or bloody diarrhea, as they can delay clearance of the infectious organisms and make the illness worse.\n" +
                    "\n" +
                    "    Also, stop using anti-motility agents after 48 hours if you have abdominal pain or if your signs or symptoms worsen and your diarrhea continues. In such cases, see a doctor.\n" +
                    "    Bismuth subsalicylate (Pepto-Bismol). This over-the-counter medication can decrease the frequency of your stools and shorten the duration of your illness. However, it isn't recommended for children, pregnant women or people who are allergic to aspirin.\n" +
                    "    Antibiotics. If you have more than four loose stools a day or severe symptoms, including a fever or blood, pus or mucus in your stools, a doctor may prescribe a course of antibiotics.\n");

        }

        if (getDocName.equals("Difficulty in Swallowing (Achalasia)")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("People with achalasia will often have trouble swallowing or feel like food is stuck in their esophagus. This is also known as dysphagia. This symptom can cause coughing and raises the risk of aspiration, or inhaling or choking on food. Other symptoms include: pain or discomfort in your chest.");
            dis_sym.setText("The most common symptom of achalasia is difficulty swallowing. ... Other symptoms can include chest pain, regurgitation of swallowed food and liquid, heartburn, difficulty burping, a sensation of fullness or a lump in the throat, hiccups, and weight loss.");
            what_to_do.setText("Oral medications,\n" +
                    "    Dilation or stretching of the esophagus,\n" +
                    "    Surgery, and\n" +
                    "    Injection of muscle-relaxing medicines (botulinum toxin) directly into the esophagus.");

        }

        if (getDocName.equals("Dislocated Shoulder")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("A dislocated shoulder is an injury in which your upper arm bone pops out of the cup-shaped socket that's part of your shoulder blade. The shoulder is the body's most mobile joint, which makes it susceptible to dislocation.");
            dis_sym.setText("    A visibly deformed or out-of-place shoulder.\n" +
                    "    Swelling or bruising.\n" +
                    "    Intense pain.\n" +
                    "    Inability to move the joint.");
            what_to_do.setText("    Ice your shoulder to reduce pain and swelling. ...\n" +
                    "    Use a sling or shoulder immobilizer to prevent further injury until you get medical treatment. ...\n" +
                    "    Take anti-inflammatory painkillers. ...\n" +
                    "    Practice stretching and strengthening exercises if your doctor recommends them.");

        }
        if (getDocName.equals("Dizziness (Dizzy)")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("Common causes of dizziness include a migraine, medications, and alcohol. It can also be caused by a problem in the inner ear, where balance is regulated. Dizziness is often a result of vertigo as well. The most common cause of vertigo and vertigo-related dizziness is benign positional vertigo (BPV).");
            dis_sym.setText("Some other possible causes of dizziness include:\n" +
                    "\n" +
                    "    sudden drop in blood pressure.\n" +
                    "    heart muscle disease.\n" +
                    "    decrease in blood volume.\n" +
                    "    anxiety disorders.\n" +
                    "    anemia (low iron)\n" +
                    "    hypoglycemia (low blood sugar)\n" +
                    "    ear infection.\n" +
                    "    dehydration.");
            what_to_do.setText("    Water pills. If you have Meniere's disease, your doctor may prescribe a water pill (diuretic). ...\n" +
                    "    Medications that reduce the dizziness. Antihistamines such as meclizine (Antivert) may offer short-term relief from vertigo. ...\n" +
                    "    Anti-nausea medications. ...\n" +
                    "    Anti-anxiety medications. ...\n" +
                    "    Preventive medicine for migraine.");

        }
        if (getDocName.equals("Dry Mouth")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("Dry mouth, or xerostomia (zeer-o-STOE-me-uh), refers to any condition in which your mouth is unusually dry. Most often, dry mouth is the result of a decrease in saliva produced by the glands in your mouth (salivary glands), and it's frequently a side effect of medication.");
            dis_sym.setText("\n" +
                    "    A sticky, dry feeling in the mouth\n" +
                    "    Frequent thirst\n" +
                    "    Sores in the mouth; sores or split skin at the corners of the mouth; cracked lips\n" +
                    "    A dry feeling in the throat\n" +
                    "    A burning or tingling sensation in the mouth and especially on the tongue\n" +
                    "    A dry, red, raw tongue\n" +
                    "    Problems speaking or trouble tasting, chewing, and swallowing\n" +
                    "    Hoarseness, dry nasal passages, sore throat\n" +
                    "    Bad breath\n");
            what_to_do.setText("To relieve your dry mouth: Chew sugar-free gum or suck on sugar-free hard candies to stimulate the flow of saliva. For some people, xylitol, which is often found in sugar-free gum or sugar-free candies, may cause diarrhea or cramps if consumed in large amounts.");

        }
        if (getDocName.equals("Ear Infection")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("An ear infection (acute otitis media) is most often a bacterial or viral infection that affects the middle ear, the air-filled space behind the eardrum that contains the tiny vibrating bones of the ear. ... Ear infections frequently are painful because of inflammation and buildup of fluids in the middle ear.");
            dis_sym.setText("The onset of signs and symptoms of ear infection is usually rapid.\n" +
                    "Children\n" +
                    "\n" +
                    "Signs and symptoms common in children include:\n" +
                    "\n" +
                    "    Ear pain, especially when lying down\n" +
                    "    Tugging or pulling at an ear\n" +
                    "    Difficulty sleeping\n" +
                    "    Crying more than usual\n" +
                    "    Acting more irritable than usual\n" +
                    "    Difficulty hearing or responding to sounds\n" +
                    "    Loss of balance\n" +
                    "    Fever of 100 F (38 C) or higher\n" +
                    "    Drainage of fluid from the ear\n" +
                    "    Headache\n" +
                    "    Loss of appetite\n" +
                    "\n" +
                    "Adults\n" +
                    "\n" +
                    "Common signs and symptoms in adults include:\n" +
                    "\n" +
                    "    Ear pain\n" +
                    "    Drainage of fluid from the ear\n" +
                    "    Diminished hearing\n");
            what_to_do.setText("Use pain relievers. Pain relievers such as nonsteroidal anti-inflammatory medicines (Advil, Aleve, and Motrin, for example) and acetaminophen (such as Tylenol) will help your child feel better. ...\n" +
                    "    Apply heat to the ear, which may help with pain. Use a warm washcloth.\n" +
                    "    Encourage rest. ...\n" +
                    "    Use eardrops.");

        }
        if (getDocName.equals("Elbow Pain")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("Tennis elbow is a condition caused by inflammation of the tendons on the outer bony prominence (lateral epicondyle) of the elbow. Certain repetitive movements of the wrist can cause this condition. Tennis elbow can occur in anyone who strains the tendons of the forearm and is not limited to tennis players");
            dis_sym.setText("Elbow pain has many other causes including trauma, arthritis, and bursitis. Funny bone sensation is irritation of a nerve at the elbow that causes numbness and tingling of the inner elbow, forearm as well as little and ring fingers. Bacteria can infect the skin of a scraped (abraded) elbow to cause pain");
            what_to_do.setText("    Step 1: Identify the location of your elbow pain. ...\n" +
                    "    Step 2: Identify the cause of your elbow pain. ...\n" +
                    "    Step 3: Begin treatment. ...\n" +
                    "    Heat. ...\n" +
                    "    Stretch. ...\n" +
                    "    Counterforce brace. ...\n" +
                    "    Wrist immobilization brace.");

        }
        if (getDocName.equals("Electrical Burns (Burns)")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("An electrical burn is a burn that results from electricity passing through the body causing rapid injury. ... Electrical burns differ from thermal or chemical burns in that they cause much more subdermal damage.");
            dis_sym.setText("    Burns or other wounds on your skin.\n" +
                    "    Headache, dizziness, confusion, or memory loss.\n" +
                    "    Fast or abnormal heartbeat.\n" +
                    "    Shortness of breath.\n" +
                    "    Weakness, stiffness, or muscle pain.\n" +
                    "    Problems walking or keeping your balance.\n" +
                    "    Red or reddish black urine.\n" +
                    "    Pain throughout your body.");
            what_to_do.setText("    Remove clothing or jewelry at the site of the burn. ...\n" +
                    "    Rinse the burned area under cool water until the pain stops. ...\n" +
                    "    Wash your hands. ...\n" +
                    "    Do not break any blisters. ...\n" +
                    "    Wash the burn site. ...\n" +
                    "    Pat the area dry. ...\n" +
                    "    Apply an antibiotic ointment. ...\n" +
                    "    Apply a bandage.");

        }
        if (getDocName.equals("Fatigue")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("Fatigue is generally defined as a feeling of lack of energy and motivation that can be physical, mental or both. Fatigue is not the same as drowsiness, but the desire to sleep may accompany fatigue. Apathy is a feeling of indifference that may accompany fatigue or exist independently.");
            dis_sym.setText("Fatigue can cause a vast range of other physical, mental and emotional symptoms including:\n" +
                    "\n" +
                    "    chronic tiredness or sleepiness.\n" +
                    "    headache.\n" +
                    "    dizziness.\n" +
                    "    sore or aching muscles.\n" +
                    "    muscle weakness.\n" +
                    "    slowed reflexes and responses.\n" +
                    "    impaired decision-making and judgement.\n" +
                    "    moodiness, such as irritability.");
            what_to_do.setText("Search Results\n" +
                    "Treatments for chronic fatigue syndrome (CFS) aim to help relieve the symptoms. The treatments used depend on how CFS affects you. Early diagnosis, taking medication to control certain symptoms, and changing your lifestyle can all help. CFS may last a long time, but treatment often helps improve the symptoms.");

        }
        if (getDocName.equals("Fecal Incontinence")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("Fecal incontinence is the inability to control bowel movements, causing stool (feces) to leak unexpectedly from the rectum. ... Common causes of fecal incontinence include diarrhea, constipation, and muscle or nerve damage");
            dis_sym.setText("Causes can include:\n" +
                    "\n" +
                    "    Muscle damage. Injury to the rings of muscle at the end of the rectum (anal sphincter) may make it difficult to hold stool back properly. ...\n" +
                    "    Nerve damage. ...\n" +
                    "    Constipation. ...\n" +
                    "    Diarrhea. ...\n" +
                    "    Loss of storage capacity in the rectum. ...\n" +
                    "    Surgery. ...\n" +
                    "    Rectal prolapse. ...\n" +
                    "    Rectocele.");
            what_to_do.setText("Medications. Depending on the cause of fecal incontinence, options include: Anti-diarrheal drugs such as loperamide hydrochloride (Imodium) and diphenoxylate and atropine sulfate (Lomotil) Bulk laxatives such as methylcellulose (Citrucel) and psyllium (Metamucil), if chronic constipation is causing your incontinence");

        }
        if (getDocName.equals("Fibrillation (Atrial Fibrillation)")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("Atrial fibrillation (AF or A-fib) is an abnormal heart rhythm characterized by rapid and irregular beating. Often it starts as brief periods of abnormal beating which become longer and possibly constant over time.Most episodes have no symptoms. Occasionally there may be heart palpitations, fainting, lightheadedness, shortness of breath, or chest pain.The disease is associated with an increased risk of heart failure, dementia, and stroke. It is a type of supraventricular tachycardia.");
            dis_sym.setText("    Palpitations, which are sensations of a racing, uncomfortable, irregular heartbeat or a flip-flopping in your chest.\n" +
                    "    Weakness.\n" +
                    "    Reduced ability to exercise.\n" +
                    "    Fatigue.\n" +
                    "    Lightheadedness.\n" +
                    "    Dizziness.\n" +
                    "    Confusion.\n" +
                    "    Shortness of breath.");
            what_to_do.setText("A pacemaker is then implanted to keep the ventricles beating properly. After AV node ablation, you'll need to continue to take blood-thinning medications to reduce the risk of stroke because your heart rhythm is still atrial fibrillation");

        }
        if (getDocName.equals("Optic Neuritis")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("Optic neuritis is an inflammation that damages the optic nerve, a bundle of nerve fibers that transmits visual information from your eye to your brain. Pain and temporary vision loss in one eye are common symptoms of optic neuritis.");
            dis_sym.setText("The three most common symptoms of optic neuritis are:\n" +
                    "\n" +
                    "    vision loss in one eye: can vary from mild to severe and lasts for 7 to 10 days.\n" +
                    "    periocular pain: pain around the eye that's often worsened by eye movements.\n" +
                    "    dyschromatopsia: inability to see colors correctly.");
            what_to_do.setText("Optic neuritis usually improves on its own. In some cases, steroid medications are used to reduce inflammation in the optic nerve. Possible side effects from steroid treatment include weight gain, mood changes, facial flushing, stomach upset and insomnia. Steroid treatment is usually given by vein (intravenously).");

        }
        if (getDocName.equals("Scars")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("Types Of Scarring. Scars form when wounds heal from causes like burns, surgery, accidents, insect bites, and acne to name a few. Scar formation is a balance between the building up of collagen and the degradation of collagen in what are called healing cascades");
            dis_sym.setText("Scars occur at the site of tissue damage and appear as firm red to purple fibrous tissue that over time usually becomes flatter and lighter in color.");
            what_to_do.setText("    Over-the-counter or prescription creams, ointments, or gels. These products can be used to treat scars that are caused by cuts or other injuries or wounds. ...\n" +
                    "    Surgical removal or treatment. There are many options to treat deeper scars depending on your particular case. ...\n" +
                    "    Injections.");

        }
        if (getDocName.equals("Urticaria (Hives)")) {

            place_img.setImageResource(R.drawable.diaforlisdet);
            dis_name.setText(getDocName);
            dis_desc.setText("Hives also known as urticaria, is a kind of skin rash with red, raised, itchy bumps. They may also burn or sting. Often the patches of rash move around. ... Hives frequently occur following an infection or as a result of an allergic reaction such as to medication, insect bites, or food.");
            dis_sym.setText("    Batches of red or white welts (wheals), usually on the face, trunk, arms or legs.\n" +
                    "    Welts that vary in size, change shape, and appear and fade repeatedly as the reaction runs its course.\n" +
                    "    Itching, which may be severe.");
            what_to_do.setText("This itchy rash is also known as urticaria, or as nettle rash. The rash may be acute (if it comes on suddenly and does not last for long) or chronic (if the rash has lasted for six weeks or more). The rash may be triggered by an allergy, or by another factor such as heat or exercise.");

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
