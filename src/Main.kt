//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Değişkenler(Variables)

    println("*************************Variables*************************")

    var sayi = 5

    println(sayi * 5)
    println(sayi + 5)
    println(sayi / sayi)

    sayi = 10
    println(sayi + sayi)


    //Stringler

    println("*************************Strings*************************")

    val isim = "Alp"
    val soyisim = "Eser"

    val isimsoyisim = isim + " " + soyisim
    println(isimsoyisim)

    val isimsoyisim2 = isim + "\t" + soyisim
    println(isimsoyisim2)

    val isimsoyisim3 = isim + "\n" + soyisim
    println(isimsoyisim3)

    val benimhayvanim = "Bneim hayvanım bir"

    val kedi = benimhayvanim + " kedi"
    println(kedi)


    //Integer Types(Int,Long,Byte,Short)->Bunlar tam sayı . veya , yok!

    println("*************************Integer Types*************************")

    val byteSayi: Byte
    byteSayi = 127
    println(byteSayi::class.java)

    val shortSayi: Short
    shortSayi = 32767
    println(shortSayi::class.java)

    val intSayi: Int //(Int dememize gerek yok en optimal boyut int dolayısıyla otomatik olarak int oluyor)
    intSayi = 844644232
    println(intSayi::class.java)

    val longSayi: Long //veya val longSayi=10L
    longSayi = 10L
    println(longSayi::class.java)


    //Ondalıklılar(Float,Double)
    println("*************************Ondaliklı Değişkenler*************************")

    //Double virgülden sonra 15,16 karakter uzar.
    val doubleSayi = 1.0
    println(doubleSayi::class.java)


    //Float virgülden sonra 6,7 karakter uzar.
    // Ondalıklı durumlar default olarak double tercih edildiği için
    // (aynı long da olduğu gibi)Floatta da değerin sonunda 'F' koymalıyız.
    val floatSayi: Float = 1.0F
    println(floatSayi::class.java)


    //Aritmatik Operatörler(+,*,/,-,%,++,--,+=,-=,...)
    println("*************************Aritmatik Operatörler*************************")

    //% Mod alma
    println(10 % 6)

    //+ Toplama
    println(10 + 6)

    //- Çıkarma
    println(10 - 6)

    //* Çarpma
    println(10 * 6)

    // / Bölme
    println(10 / 6)

    //Artırma 1
    var artirilacakSayi = 10
    artirilacakSayi++
    println(artirilacakSayi)

    //Azaltma 1
    var azaltılacakSayi = 10
    azaltılacakSayi--
    println(azaltılacakSayi)

    //Toplama +5
    var toplanılacakSayi = 10
    toplanılacakSayi += 5
    println(toplanılacakSayi)

    //Çıkartma -5
    var cikartilacakSayi = 10
    cikartilacakSayi -= 5
    println(cikartilacakSayi)


    //Yukarıdaki "-=,+=" leri farklı varyasonlarla da kullanabiliriz.(*=,/= vs)


    //Boolean(true,false)  //Mantıksal Operatörler(&&, || , !)
    println("*************************Boolean ve Mantıksal Operatörler*************************")

    val kofte = true
    val ekmek = false
    println("Köfte ekmek varmı? ${kofte || ekmek}")

    val sicak = true
    val soguk = !sicak
    println(soguk)

    //Karşılaştırma Operatörleri(<,>,==,!=,>=,<=)
    println("*************************Karşılaştırma Operatörleri*************************")

    println(5 > 2)
    println(5 != 5)
    println(5 <= 5)

    //Değişken Tipi Dönüşümleri
    println("*************************Değişken Tipi Dönüşümleri*************************")
    var sayiButString = "5"
    println(sayiButString + 5)
    var sayiCevirici = sayiButString.toInt()
    println(sayiCevirici + 5)
    println(sayiCevirici::class.java)
}