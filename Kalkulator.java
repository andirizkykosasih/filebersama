import java.io.*;
class kalkulator 
{
public static void main(String args[])
{
double hasil;
String pilih="";
boolean t=true;
int x;
double y,z;
String nilai1="";
String nilai2="";

try
{
BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));
System.out.println("================== Kalkulator ===================");
System.out.println("============== Andi Rizky Kosasih ===============");
System.out.println("== 1. Penjumlahan                              ==");
System.out.println("== 2. Pembagian                                ==");
System.out.println("== 3. Pengurangan                              ==");
System.out.println("== 4. Perpangkatan                             ==");
System.out.println("== 5. Perkalian                                ==");
System.out.println("=================================================");
System.out.print("Pilih angka 1 - 5 untuk menghitung = ");
pilih = baca.readLine();
System.out.print("Masukan angka pertama = ");
nilai1 = baca.readLine();
System.out.print("Masukan angka kedua = ");
nilai2 = baca.readLine();
x=Integer.parseInt(pilih);
y=Double.parseDouble(nilai1);
z=Double.parseDouble(nilai2);

switch(x)
{
case 1 :
hasil= y + z;
System.out.println("Hasil penjumlahan= " + hasil);
break;
case 2 :
hasil= y / z;
System.out.println("Hasil pembagian = " + hasil);
break;
case 3 :
hasil= y - z;
System.out.println("Hasil pengurangan = " + hasil);
break;
case 4 :
hasil= Math.pow(y,z);
System.out.println("Hasil perpangkatan = " + hasil);
break;
case 5 :
hasil= y * z;
System.out.println("Hasil perkalian  = " + hasil);
break;
default :
System.out.println("Piliha anda salah!!!");
}

} catch (NumberFormatException e)
{
System.out.println("Maaf yang anda masukan bukan angka!");
}
catch (ArithmeticException a)
{
System.out.println("Kesalahan aritmetika!");
} catch (IOException io)
{
System.out.println("Kesalahan IO");
}
}
}