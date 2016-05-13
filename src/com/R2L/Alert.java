package com.R2L;

import javax.swing.*;

/**
 * Created by Naz on 13/5/16.
 */
public class Alert {

        private static String Attack;

        public Alert(String attack){
            this.Attack=attack;
        }

        public static void main() {
            JOptionPane.showMessageDialog(null,"An " + Attack +" Attack is happening", "Intrusion Detection - Attack Detected", JOptionPane.ERROR_MESSAGE);

        };
    }


}
