package structural.facade.complex_subsystem;

public class HardDrive {
  public byte[] read(long lba, int size) {
    System.out.println("Reading data from Hard Drive at LBA: " + lba + ", Size: " + size);
    return new byte[size];
  }
}
