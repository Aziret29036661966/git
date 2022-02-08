package com.company;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        // write your code here
        int babki[] = {1, 3, 5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000};
        int sum[] = {10, 5, 5, 3, 2, 1, 2, 3, 3, 2, 0, 2};
        String Result = "";
        System.out.println("Введите сумму: ");
        Scanner ad = new Scanner(System.in);
        int withdraw = ad.nextInt();
        int total = 0;
        for (int i = 0; i < babki.length; i++) {
            total = total + babki[i] * sum[i];
            if (total < withdraw) {
                System.out.println("недотаточно средств");
                break;
            } else {


                {
                    for (int j = 0; j < babki.length; j++) {
                        if (withdraw > babki[j] && sum[j] > 0) {
                            int count = withdraw % babki[j];
                            if (count <= sum[j]) {
                                Result = Result + count + "x" + babki[j];
                                sum[j] = sum[j] - count;
                                total = total - count * babki[j];
                           break;
                            }

                        } else {
                            Result = Result + sum[j] + " x " + babki[j];
                            sum[j] = 0;
                            total = total - sum[j] * babki[j];

                        }
                        if (withdraw == 0) {
                            System.out.println("вы получили" + Result);

                        } else {
                            System.out.println("идите нахуй");

                        }
                    }
                }
            }
        }
    }

}




