package structural.facade;

import structural.facade.complex_subsystem.CPU;
import structural.facade.complex_subsystem.HardDrive;
import structural.facade.complex_subsystem.Memory;

public class ComputerFacade {
  private CPU cpu;
  private Memory memory;
  private HardDrive hardDrive;

  public ComputerFacade() {
    cpu = new CPU();
    memory = new Memory();
    hardDrive = new HardDrive();
  }

  public void start() {
    cpu.freeze();
    memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
    cpu.jump(BOOT_ADDRESS);
    cpu.execute();
  }

  private static final long BOOT_SECTOR = 1234;
  private static final long BOOT_ADDRESS = 987654321;
  private static final int SECTOR_SIZE = 512;
}
