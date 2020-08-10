package LanguageBasics;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AnonymousPractice {
    public interface IntercontinentalDishes{
        void modeOfEating();
    }
    void eating () {
        class China implements IntercontinentalDishes {
            @Override
            public void modeOfEating() {
                System.out.println("China: sticks");
            }
        }
        //using lamdas
        IntercontinentalDishes english =() ->
            System.out.println("English: cutlery");


        IntercontinentalDishes yoruba = new IntercontinentalDishes(){
           public void modeOfEating(){
                System.out.println("Yoruba: hand");
            }
        };
        IntercontinentalDishes intercontinentalDishes = new China();
        intercontinentalDishes.modeOfEating();

        yoruba.modeOfEating();

        english.modeOfEating();

    }
    public static void main(String[] args) {
        AnonymousPractice anonymousPractice = new AnonymousPractice();
        anonymousPractice.eating();

    }
}
