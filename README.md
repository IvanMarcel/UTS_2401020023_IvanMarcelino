1. class adalah blueprint atau cetak biru, misalnya Course.
   sedangkan object adalah hasil nyata dari class, misalnya c1 adalah objek dari Course.
2. Encapsulation penting karena:
   Melindungi data dari akses langsung yang salah.
   Menyediakan kontrol melalui getter dan setter.
   Menjaga keamanan dan konsistensi data dalam class.
3.Aggregation = “memiliki” tetapi tidak bergantung.
  Contoh:
  Student memiliki daftar Course.
  Jika objek Student dihapus, objek Course tetap bisa digunakan oleh Student lain.
  Ditandai dalam UML dengan diamond putih (◊) di sisi Student.
4. Polymorphism memungkinkan objek dari subclass yang berbeda (Student, Lecturer)diperlakukan
   sebagai tipe superclass (Person).Ketika sebuah method dipanggil melalui referensi bertipe
   superclass,implementasi instance sebenarnya (subclass) yang akan dieksekusi —ini disebut
   dynamic dispatch atau runtime polymorphism.
Penjelasan langkah-per-langkah:

- Pembuatan objek
new Student("Ivan") dan new Lecturer("Pak Dimas") membuat objek nyata bertipe Student dan Lecturer.
Masing-masing memiliki implementasi introduce() sendiri (method overriding).
- Upcasting otomatis
Saat ditempatkan ke dalam Person[], referensi ke objek Student/Lecturer di-upcast menjadi tipe
Person. Ini aman karena subclass adalah tipe khusus dari superclass.
- Pemanggilan method pada referensi superclass
Kode p.introduce() terlihat sebagai pemanggilan method pada tipe Person.
Namun Java menggunakan runtime type (tipe objek sebenarnya) untuk menentukan implementasi
mana yang dijalankan.
- Dynamic dispatch
JVM mencari method introduce() di kelas objek aktual: jika objek Student,
jalankan Student.introduce(); jika Lecturer, jalankan Lecturer.introduce();
jika tidak ada override, gunakan Person.introduce().

5. Abstract class → digunakan jika ada perilaku umum tetapi implementasi berbeda di subclass.
   Interface → digunakan jika beberapa class berbeda perlu memiliki kemampuan yang sama
   tanpa hubungan pewarisan.
