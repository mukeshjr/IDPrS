package com.prediction;

/**
 * Created by Mukesh on 05/05/2016.
 */
public class PredictAlgo{

    private int ALERT_FREQUENCY;
    private int ALERT_EFFECT;
    private int ACC_ALERT_FREQUENCY;
    private int ALERT_SEVERITY;

    private boolean INTRUSION_PROB;

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
        int sum = 0;
        int sum_alpha = 0;

        if(){
            for(int i=1; i<=4; i++){

            }

            for(int i=1; i<=4; i++){

            }
        }else{
            for(int i=1; i<=4; i++){
                for(int j=1; j<=4; j++){

                }

                sum_alpha = sum_alpha; // + something
                sum = 0;
            }

            for(int i=1; i<=4; i++){

            }
        }
    }

    private boolean intrusionProbability(int obs_ix, 4)
    {
        if(){
            INTRUSION_PROB = true;

        }else{
            INTRUSION_PROB = false;

        }

        return INTRUSION_PROB;
    }
}
