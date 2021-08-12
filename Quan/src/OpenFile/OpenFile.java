/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpenFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 *
 * @author PC1
 */
public class OpenFile {

    public static ArrayList<String> openFile(String url) {
        ArrayList<String> a = new ArrayList<>();
        BufferedReader out = null;
        try {
            File file = new File(url);
            out = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF8"));
            String str = out.readLine();
            while (str != null) {
                a.add(str);
                str = out.readLine();
            }
            out.close();
        } catch (Exception e) {
        }
        return a;
    }

    public static int calculateAge(String date) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dfYear = new SimpleDateFormat("yyyy");
        SimpleDateFormat dfDay = new SimpleDateFormat("dd");
        SimpleDateFormat dfMonth = new SimpleDateFormat("MM");
        int day = Integer.parseInt(dfDay.format(df.parse(date)));
        int month = Integer.parseInt(dfMonth.format(df.parse(date)));
        int year = Integer.parseInt(dfYear.format(df.parse(date)));
        return Period.between(LocalDate.of(year, month, day), LocalDate.now()).getYears();
    }
}
