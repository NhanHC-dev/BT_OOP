package Polymorphism.bt4;

public class Tester extends Employee {
    private int soLoiPhatHien;

    public Tester() {
        super();
    }

    public Tester(int soLoiPhatHien) {
        super();
        this.soLoiPhatHien = soLoiPhatHien;
    }

    public int getSoLoiPhatHien() {
        return soLoiPhatHien;
    }

    public void setSoLoiPhatHien(int soLoiPhatHien) {
        this.soLoiPhatHien = soLoiPhatHien;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhập số lỗi phát hiện: ");
        soLoiPhatHien = scanner.nextInt();
    }

    @Override
    public int tinhLuong() {
        this.luong = this.luongCoBan + this.soLoiPhatHien * 50000;
        return this.luong;
    }
    @Override
    public String toString() {
        return super.toString() + "\n, số lỗi phát hiện: " + this.soLoiPhatHien +
                ", lương: " + this.luong;
    }
}
