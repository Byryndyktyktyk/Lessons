public class Nomer4 {

    public static void main(String[] args) {
        long maxlong = 922337203;//Максимальное число 9223372036854775807, а дальше 922337203 пишет ошибку. Когда после 922337203 ставишь 9223372036 и далее то, все число подчеркивается красной волнистой линией
        System.out.println("Первоначально значение long = " + maxlong);
        System.out.println("Значение после инкремента long = " + maxlong++);
        System.out.println("Значение после декремента long = " + maxlong--);

    }
}
