package com.response;

import javax.swing.*;

/**
 * Created by Naz on 13/5/16.
 */
public class Alert {

        private static String Attack;

        public Alert(String attack){
            Attack=attack;
        }

        public static void main() {
            JOptionPane.showMessageDialog(null,"An " + Attack +" Attack is happening",
                    "Intrusion Detection - Attack Detected", JOptionPane.ERROR_MESSAGE);

            Email sendEmail = new Email("mukesh271194@gmail.com", "qwertify2015@gmail.com", "IDPrS - Intrusion Alert", "An "
                    + Attack + " Attack is happening" + "," + "Intrusion Detection - Attack Detected");
            sendEmail.main(null);

        }
}
