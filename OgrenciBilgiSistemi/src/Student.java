public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        calcAverageNote();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulkSozluNote(int mat, int fizik, int kimya){
        if (mat >= 0 && mat <= 100) {
            this.mat.note2 = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note2 = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note2 = kimya;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void calcAverageNote(){
        this.mat.averagenote=(this.mat.note2*2/10)+(this.mat.note*8/10);
        this.fizik.averagenote=(this.fizik.note2*2/10)+(this.fizik.note*8/10);
        this.kimya.averagenote=(this.kimya.note2*2/10)+(this.kimya.note*8/10);
    }

    public void calcAverage() {
        this.average = (this.fizik.averagenote + this.kimya.averagenote + this.mat.averagenote) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.averagenote);
        System.out.println("Fizik Notu : " + this.fizik.averagenote);
        System.out.println("Kimya Notu : " + this.kimya.averagenote);
    }

}