package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main {

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData() {
        Healthplan plan1 = new Healthplan(1, "X Sigorta", Healthplan.Plan.PREMIUM);
        Healthplan plan2 = new Healthplan(2, "Y Sigorta", Healthplan.Plan.BASIC);

        Employee developer = new Employee(7, "Halil", "halil@junk.com", "7777");
        developer.addHealthplan(0, plan1.getName());
        developer.addHealthplan(1, plan2.getName());

        System.out.println(developer);

        Company company = new Company(1, "Workintech", 100);
        company.addDeveloper(0, developer.getFullName());

        System.out.println(company);
    }

    public static void main(String[] args) {
        workWithData();
    }
}

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */

