package Codewars;
/*
В небольшом городе население составляет p0 = 1000 в начале года.
Население регулярно увеличивается на 2 процента в год, и, кроме того, в город ежегодно приезжает 50 новых жителей.
Сколько лет нужно городу, чтобы его население увеличилось или стало равным p = 1200 жителям?
 */

public class GrowthOfPopulation {

    /* РЕШЕНИЕ С КОДВАРС
        public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        while (p0 < p) {
            p0 += p0 * percent / 100 + aug;
            years++;
        }
        return years;
    }
     */
    public static int nbYear(int p0, double percent, int aug, int p) {
        double startPopulation = (double)p0;
        double growth = (double)aug;
        double finishPopulation = (double)p;
        int year = 0;
        percent = percent*0.01;
        while (startPopulation<finishPopulation){
            startPopulation=(startPopulation+startPopulation*percent)+growth;
            startPopulation = Math.floor(startPopulation);
            year++;
        }
        return year;
    }
    public static void main(String[] args){
        System.out.println(nbYear(1000, 2,50,1214) + " лет нужно.");
    }
}
