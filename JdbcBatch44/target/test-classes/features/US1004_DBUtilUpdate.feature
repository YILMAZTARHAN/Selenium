Feature: US1004 Kullanici Kayitlari update eder

  Scenario: TC04:Kullanici IDHotel degeri verilen EMAil'i Update edebilmeli

    Given kullanici DBUtil ile HMC veri tabanina baglanir
    Then tHotel tablosunda IDHotel degeri 1016 olan kaydin Email bilgisini "Allahkolaylıkversin@gmail.com" yapar