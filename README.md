#### JAVA SWING ARAYÜZÜ İLE OLUSTURULMUS KART OYUNU
 
- Özet
Bu projede nesneye yönelik programlama ve arayüz programlama ile basit bir kart oyunu gerçekleştirdik. Oyun, basketbolcu ve tenisçi
kartlarıyla oynanan basit bir oyundur. Oyunu; çeşitli veri yapılarını ve kalıtım, kapsülleme gibi nesneye yönelik programlamanın temel
kavramlarını kullanarak tamamladık.

- GİRİŞ

Projeyi oluşturmak için Java Programlama Dili belirlenmiştir. Kart oyunu projesi kullanıcı tarafından çalıştırılmaktadır. Oluşturulan “start”
butonuna basıldığında oyun ekranı karşımıza gelmektedir. Oyun, bilgisayar ve kullanıcı arasında oynanmaktadır. Her iki tarafa da
kartların dağıtılmasıyla oyun başlamaktadır. İlk olarak kullanıcı istediği bir kartı atar ve
bilgisayardan gelen aynı kategoriden bir kartla karşılaştırılır. Dağıtılan kartlar bittiğinde oyun da son bulmaktadır. En yüksek puana sahip oyuncu kazanmış kabul edilmektedir.

![asa](https://user-images.githubusercontent.com/56557278/109875631-c30d8280-7c81-11eb-92ae-3723422a9422.jpg)

- Arayüz Tasarımı

Projede oyunu ekranını tasarlamak için Java'nın grafik kütüphanelerinden swing(GUI)yi tercih ettik.

![aa](https://user-images.githubusercontent.com/56557278/109875702-d6205280-7c81-11eb-9e00-de987514e5f2.jpg)


- 	Kullanılan Sınıf ve Nesne Yapısı
Program, Java programlama dilinde gerçekleştirilmiş olup geliştirme ortamı olarak Eclipse kullanılmıştır. 
 
 ![a](https://user-images.githubusercontent.com/56557278/109875785-ee906d00-7c81-11eb-9e5a-bf9a989f1f12.jpg)

Oyun başlangıcı Oyuncunun seçtiği kart ile bilgisayardan atanan kartı, random belirlenen özelliğe bakılarak if else yapılarıyla kıyasladık. Kimin puan alacağını belirleyerek puanları panele yazdırdık. Oyun esnasında, örneğin basketbolcu kartlarından sonra tenisçi
kartlarının oyunu devam ettirilebilmesi için setVisible() methoduyla karşılaştırılan kartların sahip olduğu sınıftan olan kartlar ekranda
kapalı görüntülenmektedir.
