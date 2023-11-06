# Java-Homework5
Emre Akgüzel 

Birleşik Modelleme Dili (Unified Modelling Language), iş sistemlerinin nasıl modellenebileceğini belirleyen ve açıklayan yöntemlerin bir araya toplanmış hâlidir. 
Daha çok yazılım geliştiriciler tarafından kullanılmaktadır. Ancak bir iş sistemini veya bir süreci veya herhangi bir şeyi grafik ile açıklamak isteyen herkesçe kullanılabilir.
Programın analiz ve dizayn aşamasında UML'e büyük ölçüde ihtiyaç duyulmaktadır. Düzgün bir modellemeyle birçok problemin çıkmasına engel olunabilir. 
Daha çok nesneye dayalı programlama dilleri için uygun olan UML, problemleri parçalara ayırıp parçalar arasında belirli ilişkiler sağlayabilmeye dayanır. 


Sınıf Diyagramı

Sınıf diyagramları en yaygın UML diyagramlarıdır. Sınıf diyagramlarının en verimli kullanıldıgı alanlardan birisi nesne yönelimli tasarımdır: Gerçek hayattan alınan örneklere göre sınıflar ve ona ait özellikler ve ifade edebileceği davranışlar belirlenir ve bunlar sınıf diyagramı olarak çizilir. 
Sınıflar arası çeşitli ilişkiler olabilir. Mesela bir sınıf başka bir sınıfı kullanıyor olabilir bu durumda iki sınıf arası ilişki kesikli çizgi ile belirtilir. Veya bir sınıf başka bir sınıftan ibaret (composition) olabilir bu durumda iki sınıf arası ilişki çizgisine içi boş baklava şekli eklenir.

ArrayList sınıfı, Java.util paketinde bulunabilen, yeniden boyutlandırılabilir bir dizidir.

Yerleşik bir dizi ile Java'daki ArrayList arasındaki fark, bir dizinin boyutunun değiştirilememesidir (bir diziye öğe eklemek/diziden öğe çıkarmak istiyorsanız, yeni bir tane oluşturmanız gerekir). ArrayList'e istediğiniz zaman öğeler eklenebilir ve çıkarılabilir. Sözdizimi de biraz farklıdır( ArrayList<String> cars = new ArrayList<String>(); ) 


LinkedList sınıfı ArrayList ile neredeyse aynıdır. ArrayList sınıfının içinde düzenli bir dizi bulunur. Bir eleman eklendiğinde diziye yerleştirilir. Dizi yeterince büyük değilse, eskisinin yerine yeni, daha büyük bir dizi oluşturulur ve eskisi kaldırılır.

LinkedList ise öğelerini "kapsayıcılarda" saklar. Listenin ilk konteynere bir bağlantısı vardır ve her konteynerin listedeki bir sonraki konteynere bağlantısı vardır. Listeye bir öğe eklemek için öğe yeni bir kaba yerleştirilir ve bu kap, listedeki diğer kaplardan birine bağlanır.

Yani ArrayList datayı saklayıp ona ulaşmakta , LinkedList ise datayı manipule etmek daha uygundur.



HashMap, öğeleri "anahtar/değer" çiftlerinde saklar ve bunlara başka türden bir indeksle (örneğin bir String) erişebilirsiniz.

Bir nesne, başka bir nesneye (değer) anahtar (indeks) olarak kullanılır. Farklı türleri saklayabilir. (örnek: HashMap<String, String> capitalCities = new HashMap<String, String>(); sonra capitalCities.put("England", "London"); ,     capitalCities.put("Germany", "Berlin");    System.out.println(capitalCities); )

HashSet, her öğenin benzersiz olduğu öğelerden oluşan bir koleksiyondur ve Java.util paketinde bulunur.(örnek: HashSet<String> cars = new HashSet<String>(); cars.add("BMW"); cars.add("BMW");  cars.add("Ford"); şeklinde olursa ve System.out.println(cars); sonuçta bmw yi sadece 1 kez yazar.)
