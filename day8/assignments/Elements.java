package week3.day8.assignments;

import org.apache.poi.ss.formula.functions.T;
import org.checkerframework.checker.units.qual.C;

public class Elements extends Button{
    public static void main(String[] args) {
        Elements obj=new Elements();
        //Using object to call methods in inherited classes.
        obj.submit();
        obj.click();
        obj.setText("From Elements");

        CheckBoxButton obj2=new CheckBoxButton();
        obj2.clickCheckButton();
        obj2.click();
        obj2.setText("From CheckBoxButton");

        RadioButton obj3=new RadioButton();
        obj3.selectRadioButton();
        obj3.click();
        obj3.setText("From RadioButton");

        TextField obj4=new TextField();
        obj4.getText();
        obj4.click();
        obj4.setText("From Text Field");
    }
}
