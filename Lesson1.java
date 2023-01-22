public class Lesson1 {
    public static void Lesson1(String[] args) {
        System.out.println("1. Ñîçäàíèå ïåðåìåííûõ è âûâîä èõ çíà÷åíèé íà êîíñîëü ");
        byte nbyte;
        nbyte = 126;
        System.out.println("nbyte = " + nbyte);
        short shorts;
        shorts = -30000;
        System.out.println("shorts = " + shorts);
        int intle;
        intle = 288472;
        System.out.println("intle = " + intle);
        long longe;
        longe = - 7842424l;
        System.out.println("longe = " + longe);
        float floatw;
        floatw = 2131f;
        System.out.println("floatw = " + floatw);
        double doublin;
        doublin = 16154;
        System.out.println("doublin = " + doublin);
        char charen;
        charen = 0;
        System.out.println("charen = " + charen);
        boolean boblean;
        boblean = false;
        System.out.println("boblean = " + boblean);

        System.out.println("2. Ðàñ÷åò ñòîèìîñòè òîâàðà ñî ñêèäêîé");
        int x = 100;
        int y = 200;
        int c = x+y;//c-ýòî îáùàÿ ñóììà
        int z = c/100;//z-ýòî 1 ïðîöåíò îò ñóììû
        int b = z*11;//b-ñóììà ñêèäêè
        int g = 300-b;//g-îáùàÿ ñòîèìîñòü òîâàðîâ ñî ñêèäêîé
        System.out.println("Ñóììà ñêèäêè = " + b);
        System.out.println("Îáùàÿ ñòîèìîñòü òîâàðîâ ñî ñêèäêîé = " + g);

        System.out.println("4. Îòîáðàæåíèå min è max çíà÷åíèé ÷èñëîâûõ òèïîâ äàííûõ");
        byte mbyte;
        mbyte = 127;
        mbyte++;
        mbyte--;
        System.out.println("Ïåðâîíà÷àëüíîå çíà÷åíèå nbyte = " + mbyte);
        System.out.println("Çíà÷åíèå ïîñëå èíêðåìåíòà nbyte = " + mbyte++);
        System.out.println("Çíà÷åíèå ïîñëå äåêðåìåíòà nbyte = " + mbyte--);

        System.out.println("5. Ïåðåñòàíîâêà çíà÷åíèé ïåðåìåííûõ");
        int a;
        int l;
        a = 1;
        b = 2;
        System.out.println("Èñõîäíîå Çíà÷åíèå a = " + a);
        System.out.println("Èñõîäíîå Çíà÷åíèå b = " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("C ïîìîùüþ òðåòüåé ïåðåìåííîé a = " + a);
        System.out.println("C ïîìîùüþ òðåòüåé ïåðåìåííîé b = " + b);
        int a1;
        int b1;
        a1 = 1;
        b1 = 2;
        a1 = a1 - b1;
        b1 = a1 + b1;
        a1 = -a1 + b1;
        System.out.println("C ïîìîùüþ àðèôìåòè÷åñêèõ îïåðàöèé a = " + a1);
        System.out.println("C ïîìîùüþ àðèôìåòè÷åñêèõ îïåðàöèé b = " + b1);

        System.out.println("6. Âûâîä ñèìâîëîâ è èõ êîäîâ");
        int r = 35;
        int t = 38;
        int o = 64;
        int u = 94;
        int i = 95;
        char r1 = (char) r;
        System.out.print("Êîä ñèìâîëà: " + r);
        System.out.println(" Ñèìâîë " + r1);
        char t1 = (char) t;
        System.out.print("Êîä ñèìâîëà: " + t);
        System.out.println(" Ñèìâîë " + t1);
        char o1 = (char) o;
        System.out.print("Êîä ñèìâîëà: " + o);
        System.out.println(" Ñèìâîë " + o1);
        char u1 = (char) u;
        System.out.print("Êîä ñèìâîëà: " + u);
        System.out.println(" Ñèìâîë " + u1);
        char i1 = (char) i;
        System.out.print("Êîä ñèìâîëà: " + i);
        System.out.println(" Ñèìâîë " + i1);

        System.out.println("7. Ïðîèçâåäåíèå è ñóììà öèôð ÷èñëà");
        int number = 345;
        int sum = 0;
        int currentDigit;
        currentDigit = number % 10;
        sum += currentDigit;
        number /= 10;
        currentDigit = number % 10;
        sum += currentDigit;
        number /= 10;
        currentDigit = number % 10;
        sum += currentDigit;
        System.out.println(sum);
        double firstNum = 345/100;
        double secondNum = 345/86.25;
        double thirdNum = 345/69;
        double proizvedenie = firstNum*secondNum*thirdNum;
        System.out.println(proizvedenie);
    }
}
