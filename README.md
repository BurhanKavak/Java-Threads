# Java-Threads

## <h2> Thread Nedir? </h2>

<p> Her bir işlemin altında çalışan alt işlemlere ve 
aynı anda birden fazla işlem yapmayı sağlayan yapıya thread denir.
Bu yapı sayesinde işlemler birbirlerini beklemeden kendi işlemini yapar. </p>

Java’da herhangi bir uygulamayı çalıştırdığımızda varsayılan olarak ana (main) bir iş parçacığı (Thread) ayağa kaldırılır. Bu ana iş parçacığına ek olarak yazılımcılarda alt iş parçacıkları çalıştıralabilir. 

Bunu 2 şekilde yapabiliriz:
1.	“Thread” sınıfından kalıtım alan bir alt sınıf yaratıp, onun “run” fonksiyonunu override(ezme) etmek gerekir.
2.	“Runnable” interface’den kalıtım alan bir alt sınıf yaratmak ve “run” fonksiyonunu ovveride etmek ardınadn “Thread” sınıfının kurucusuna nesne olarak göndermek.

<b>NOT:</b> Java çoklu kalıtımı desteklemediğinden <b>Runnable</b> arayüzünün kullanımı faydalı olacaktır.



Thread yönetiminde dikkat etmemiz gereken
birden fazla thread aynı anda tek bir kaynağı kullanmaya çalıştığında belirsiz durum ortaya çıkar.
SimpleThread2 Örneğine baktığımızda her çalıştırıldığında farklı bir sonuç verecektir.

![image](https://user-images.githubusercontent.com/79043326/222437094-09248bf6-8c9a-4358-b31a-e58029390ba8.png)


<p>Bu belirsizliğin önüne geçmek için thread’ler arasında senkronizasyon iyi bir şekilde yapılması gerekir.</p>
<p>Senkronizasyonun iyi bir şekilde yapılması için çeşitli teknikler kullanılır bunların 2 tanesini inceleyecek olursak :</p>
<p>Birincisi threadler belirli bir süre durdurulabilir.</p>
<p>Bunun örneği SimpleThread3'de gösterilmiştir sonucunu inceleyelim:</p>

![image](https://user-images.githubusercontent.com/79043326/222437917-42b80115-9e58-4e81-bbc7-347b6ec13ee4.png)

Burada önce thread-0 ardından thread-1 çalışmaktadır.<br>
Bu yöntem senkronizasyonu sağlarken thread yapısının sağladığı avantajı ortadan kaldırır.<br> <br>
Diğer bir yöntem ise <b>synchronized</b> anahtar kelimesini kullanmaktır.<br>
SimpleThread4 sınıfında bunu uyguluyoruz.<br>
Bu sınıfı da çalıştırdığımızda SimpleThread3 sınıfındaki sonuçla aynıdır ve daha kullanışlı olmaktadır.


