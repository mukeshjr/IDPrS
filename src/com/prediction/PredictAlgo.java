package com.prediction;

import com.prediction.HMM.HMMEval.EvalGLRHMM;
import com.prediction.HMM.HMMs.GLRHMM;

/**
 * Created by Mukesh on 05/05/2016.
 */
public class PredictAlgo{

    private int ALERT_FREQUENCY;
    private int ALERT_EFFECT;
    private int ACC_ALERT_FREQUENCY;
    private int ALERT_SEVERITY;



    private boolean INTRUSION_PROB = false;

    private void calculateAlertFrequency()
    {

    }

    private void calculateAlertEffect()
    {

    }


    private void calculateAcceptableAlertFrequency()
    {

    }

    private void alertSeverityModulation()
    {

        if(ALERT_SEVERITY >= 4){

        }else if (ALERT_SEVERITY >= 3){

        }else if (ALERT_SEVERITY >= 2){

        }else{

        }
    }

    private void updateStateDistribution()
    {


//        int sum = 0;
//        int sum_alpha = 0;
//
//        if(sum == 0){
//            for(int i=1; i<=4; i++){
//                System.out.println();
//            }
//
//            for(int i=1; i<=4; i++){
//                System.out.println();
//            }
//        }else{
//            for(int i=1; i<=4; i++){
//                for(int j=1; j<=4; j++){
//                    System.out.println();
//                }
//
//                sum_alpha = sum_alpha; // + something
//                sum = 0;
//            }
//
//            for(int i=1; i<=4; i++){
//                System.out.println();
//            }
//        }
    }

    private void intrusionProbability(int obs_ix, int s)
    {
        s = 4;

        if(obs_ix == 0){
            INTRUSION_PROB = true;

        }else{
            INTRUSION_PROB = false;

        }
    }


}
