package org.example;
//creo e stampo la variabile todayDay che sarebbe il giorno stesso in cui siamo
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //mi son permesso di trovar un modo per
        //la data mi dava fastidio in quel formato

        LocalDate todayDay= LocalDate.now();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatTodayDay = formatter.format(todayDay);
        System.out.println("Oggi è il " + formatTodayDay);

        //grazie alla classe LocalDate ora con.getDayOf e.lengthOf posso crearmi delle variabili
        //dove posso dire in che giorno del mese o dell anno mi trovo e mi serve sapere il totale
        //dei giorni del mese in cui mi trovo e il numero totale dei giorni dell anno (questo perchè
        //può essere bisestile)

           int dayOfCurrentMonth = todayDay.getDayOfMonth();
           // System.out.println(dayOfCurrentMonth); qui mi dice in che giorno del mese infatti mi dice 2
           int dayOfCurrentYear= todayDay.getDayOfYear();
           int totalDayOfMonth= todayDay.lengthOfMonth();//qui mi dirà che luglio ha 31 giorni
           int totalDayOfYear= todayDay.lengthOfYear(); //stessa cosa qui con l anno (365??)

                //ok, ora devo stampar da consegna dell'esercizio quanti giorni mancano da oggi
                //alla fine del mese e un altra stampa con quanti giorni mancano alla fine dell'anno

                     System.out.println("At the end of the month, there are "+ (totalDayOfMonth-dayOfCurrentMonth) + " days left.");
                     System.out.println( "At the end of the year, there are "+ (totalDayOfYear-dayOfCurrentYear) + " days left.");
    }
}

