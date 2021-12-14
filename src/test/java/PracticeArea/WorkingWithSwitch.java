package PracticeArea;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkingWithSwitch {


    @Test
    public void useSwitchToConvertCurrencyIntoGBPForSalary(){

        List<String> salaries = Arrays.asList("$2000","$50000");
        List<Double> poundConvertedSalaries = new ArrayList<>();
        salaries.forEach(
                                salary -> {
                                    if (salary.contains("$")){
                                        Integer numericSalary = Integer.valueOf(salary.replace("$",""));
                                        double salaryInt = numericSalary.intValue() * 0.76;
                                        poundConvertedSalaries.add(salaryInt);

                                    }
                                    else if (salary.contains("INR")){
                                        Integer numericSalary = Integer.valueOf(salary.replace("INR",""));
                                        double salaryInGBP = numericSalary.intValue()*0.01;
                                        poundConvertedSalaries.add(salaryInGBP);

                                    }
                                }

                        );

        System.out.println(salaries);
        System.out.println(poundConvertedSalaries);

//        System.out.println("The stream after applying "
//                + "the function is : ");
//
//        // Creating a list of Integers
//        List<Integer> list = Arrays.asList(2,3,4,5);
//
//        // Using Stream map(Function mapper) to
//        // convert the Strings in stream to
//        // UpperCase form
//        List<Integer> answer = list.stream().map(item->item*3).
//                collect(Collectors.toList());
//
//        // displaying the new stream of UpperCase Strings
//        System.out.println(answer);

    }
//    public String currencyConverterToPound(String salary){
//        return switch(salary){
//            case (String s && s.startsWith("$")) -> s.replace("$", "");
//            case salary.startsWith("INR") -> salary.replace("INR", "");
//            default -> 0;
//        }
    }


