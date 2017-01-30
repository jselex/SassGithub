/*
 * Selles failis tuleb igal pool asendada kaldkriipsudest koosnevad read
 * sobiliku javadoc kommentaariga. Seej2rel genereerida javadoc ja
 * kontrollida, et poleks t2itmata j22nud lahtreid.
 */

/** Peameetodit sisaldav silumisklass. Siit algab kogu programmi töö. 
* @author Alexander
* @version 0.1
* @since 1.2
*/
public class Kellad { // peameetodit sisaldav silumisklass
   
/** Peameetod. Kutsub välja teised meetodid. 
* @param s käsurealt antud sisend
*/
   public static void main (String[] s) {
      Kell k = new KaeKell ("Rolex");
      System.out.println (((KaeKell)k).mark 
         + " " + k.jooksevAeg());
      Mobla m = new Mobla (25612345);
      System.out.println (String.valueOf (m.number)
         + " " + m.jooksevAeg());
   } // main

} // Kellad

/** Jooksva kellaaja tekstiline esitamine.
*/
interface Ajanaitaja { // liides, mis kirjeldab oskust aega n2idata

   /** Tagastab jooksva kelleaja stringina. 
   */
   String jooksevAeg(); // tagastab jooksva kellaaja stringina

} // Ajanaitaja

/** Klass, mis sisaldab aja n2itamis meetodit. 
*/
class Kell implements Ajanaitaja {

   /** Jooksva aja leidmine Date klassi meetodi abil.
   * @return date
   */
   public String jooksevAeg() {
      return new java.util.Date().toString();
   } // jooksevAeg

} // Kell

/** Käelella omadusi kirjeldav klass.
*/
class KaeKell extends Kell {

   /** Käekellade tootjafirma nimi */
   String mark; // kaekelladel peame meeles ka marki

   /** Käekella konstruktor. Loob uue käekella.
   * @param s kella mark
   */
   KaeKell (String s) {
      mark = s;
   } // konstruktor

} // KaeKell

/** Telefoni omadusi kirjeldav klass. Tegelikult ei tohi telefoninumber int olla!
*/
class Telefon {

   /** Telefoninuber */
   int number; // telefoninumber

   /** Telefoni konstruktor.
   * @param n telefoni number
   */

   Telefon (int n) {
      number = n;
   } // konstruktor

} // Telefon

/**Mobiiltelefoni omadusi kirjeldav klass. Mobla oskab aega näidata.
*/
class Mobla extends Telefon implements Ajanaitaja {

   /** Moblasse sisseehitatud kell. 
   */
   private Kell sisemineKell; // moblasse sisseehitatud kell

   /** Mobla konstruktor. 
   * @param n mobla number
   */
   Mobla (int n) {
      super (n);
      sisemineKell = new Kell();
   } // konstruktor

   /**
   */
   public String jooksevAeg() {
      return sisemineKell.jooksevAeg();
   } // jooksevAeg

} // Mobla

// faili l6pp

