package day51_Map;

import javax.swing.*;

public class TestEnum {
    public static void main(String[] args) {
        Browser browser = Browser.SAFARI;

        switch (browser) {
            case FIREFOX:
                System.out.println("Firefox");
                break;

            case EDGE:
                System.out.println("Edge");
                break;

            case OPERA:
                System.out.println("Opera");
                break;

            case CHROME:
                System.out.println("Chrome");
                break;

            default:
                System.out.println("Safari");
                break;
        }

        System.out.println("---------------------------");

        Seasons season = Seasons.AUTUMN;

    }
}
