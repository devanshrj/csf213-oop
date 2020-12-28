package lab5;

import java.util.ArrayList;

public class TextApp {
        // Split() method
        // String[] Split() {

        // }

        // UniqueLabels() method
        String[] UniqueLabels(String words[]) {
                // store in ArrayList for dynamci and contains()
                ArrayList<String> labelsList = new ArrayList<>();
                for (int i = 0; i < words.length; i++) {
                        if (!(labelsList.contains(words[i].toLowerCase())))
                                labelsList.add(words[i]);
                }

                // convert ArrayList to Array
                String[] labels = new String[labelsList.size()];
                labels = labelsList.toArray(labels);
                return labels;
        }

        // Count() method
        // String[] Count(String words[], String labels[]) {
        //         //
        // }

        // display() method
        void display(int n) {

        }
} // end of class TextApp.
