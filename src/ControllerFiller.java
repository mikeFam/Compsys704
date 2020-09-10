import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ControllerFiller extends ClockDomain{
  public ControllerFiller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.INPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.INPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal valveInjectorOnOffM = new Signal("valveInjectorOnOffM", Signal.INPUT);
  public Signal valveInletOnOffM = new Signal("valveInletOnOffM", Signal.INPUT);
  public Signal dosUnitValveRetractM = new Signal("dosUnitValveRetractM", Signal.INPUT);
  public Signal dosUnitValveExtendM = new Signal("dosUnitValveExtendM", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  private Signal selectM_1;
  private Signal selectA_1;
  private int S6462 = 1;
  private int S5553 = 1;
  private int S5281 = 1;
  private int S5289 = 1;
  private int S5283 = 1;
  private int S5297 = 1;
  private int S5305 = 1;
  private int S5313 = 1;
  private int S6445 = 1;
  private int S5555 = 1;
  private int S5591 = 1;
  private int S5564 = 1;
  private int S5572 = 1;
  private int S5599 = 1;
  private int S5607 = 1;
  private int S6460 = 1;
  private int S6459 = 1;
  
  private int[] ends = new int[13];
  private int[] tdone = new int[13];
  
  public void thread6495(int [] tdone, int [] ends){
        switch(S6460){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S6459){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerFiller.sysj line: 58, column: 9
              S6459=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerFiller.sysj line: 60, column: 7
                selectM_1.setPresent();//sysj\controllerFiller.sysj line: 61, column: 5
                currsigs.addElement(selectM_1);
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                selectA_1.setPresent();//sysj\controllerFiller.sysj line: 64, column: 5
                currsigs.addElement(selectA_1);
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            else {
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerFiller.sysj line: 60, column: 7
              selectM_1.setPresent();//sysj\controllerFiller.sysj line: 61, column: 5
              currsigs.addElement(selectM_1);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              selectA_1.setPresent();//sysj\controllerFiller.sysj line: 64, column: 5
              currsigs.addElement(selectA_1);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6493(int [] tdone, int [] ends){
        switch(S5607){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 49, column: 6
        currsigs.addElement(valveInletOnOff);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread6492(int [] tdone, int [] ends){
        switch(S5599){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 45, column: 6
        currsigs.addElement(dosUnitValveExtend);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread6490(int [] tdone, int [] ends){
        S5607=1;
    System.out.println("InletOn");//sysj\controllerFiller.sysj line: 48, column: 7
    valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 49, column: 6
    currsigs.addElement(valveInletOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread6489(int [] tdone, int [] ends){
        S5599=1;
    System.out.println("ValveExtend");//sysj\controllerFiller.sysj line: 44, column: 7
    dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 45, column: 6
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread6487(int [] tdone, int [] ends){
        switch(S5572){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 39, column: 6
        currsigs.addElement(valveInjectorOnOff);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread6486(int [] tdone, int [] ends){
        switch(S5564){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\controllerFiller.sysj line: 35, column: 6
        currsigs.addElement(dosUnitValveRetract);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread6484(int [] tdone, int [] ends){
        S5607=1;
    System.out.println("InletOn");//sysj\controllerFiller.sysj line: 48, column: 7
    valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 49, column: 6
    currsigs.addElement(valveInletOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread6483(int [] tdone, int [] ends){
        S5599=1;
    System.out.println("ValveExtend");//sysj\controllerFiller.sysj line: 44, column: 7
    dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 45, column: 6
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread6481(int [] tdone, int [] ends){
        S5572=1;
    System.out.println("InjectorOn");//sysj\controllerFiller.sysj line: 38, column: 7
    valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 39, column: 6
    currsigs.addElement(valveInjectorOnOff);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread6480(int [] tdone, int [] ends){
        S5564=1;
    System.out.println("ValveRetract");//sysj\controllerFiller.sysj line: 34, column: 7
    dosUnitValveRetract.setPresent();//sysj\controllerFiller.sysj line: 35, column: 6
    currsigs.addElement(dosUnitValveRetract);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread6479(int [] tdone, int [] ends){
        switch(S6445){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S5555){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerFiller.sysj line: 29, column: 9
              System.out.println((mode.getpreval() == null ? null : ((Integer)mode.getpreval())));//sysj\controllerFiller.sysj line: 30, column: 3
              S5555=1;
              S5591=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            if(selectM_1.getprestatus()){//sysj\controllerFiller.sysj line: 31, column: 10
              S5555=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              switch(S5591){
                case 0 : 
                  if(bottleAtPos2.getprestatus()){//sysj\controllerFiller.sysj line: 32, column: 11
                    S5591=1;
                    thread6480(tdone,ends);
                    thread6481(tdone,ends);
                    int biggest6482 = 0;
                    if(ends[8]>=biggest6482){
                      biggest6482=ends[8];
                    }
                    if(ends[9]>=biggest6482){
                      biggest6482=ends[9];
                    }
                    if(biggest6482 == 1){
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                  }
                  else {
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  break;
                
                case 1 : 
                  if(dosUnitFilled.getprestatus()){//sysj\controllerFiller.sysj line: 33, column: 11
                    System.out.println("InjectorOff");//sysj\controllerFiller.sysj line: 42, column: 5
                    S5591=2;
                    thread6483(tdone,ends);
                    thread6484(tdone,ends);
                    int biggest6485 = 0;
                    if(ends[10]>=biggest6485){
                      biggest6485=ends[10];
                    }
                    if(ends[11]>=biggest6485){
                      biggest6485=ends[11];
                    }
                    if(biggest6485 == 1){
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                  }
                  else {
                    thread6486(tdone,ends);
                    thread6487(tdone,ends);
                    int biggest6488 = 0;
                    if(ends[8]>=biggest6488){
                      biggest6488=ends[8];
                    }
                    if(ends[9]>=biggest6488){
                      biggest6488=ends[9];
                    }
                    if(biggest6488 == 1){
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    //FINXME code
                    if(biggest6488 == 0){
                      System.out.println("InjectorOff");//sysj\controllerFiller.sysj line: 42, column: 5
                      S5591=2;
                      thread6489(tdone,ends);
                      thread6490(tdone,ends);
                      int biggest6491 = 0;
                      if(ends[10]>=biggest6491){
                        biggest6491=ends[10];
                      }
                      if(ends[11]>=biggest6491){
                        biggest6491=ends[11];
                      }
                      if(biggest6491 == 1){
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                    }
                  }
                  break;
                
                case 2 : 
                  if(dosUnitEvac.getprestatus()){//sysj\controllerFiller.sysj line: 43, column: 11
                    System.out.println("InletOff");//sysj\controllerFiller.sysj line: 52, column: 5
                    S5555=0;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    thread6492(tdone,ends);
                    thread6493(tdone,ends);
                    int biggest6494 = 0;
                    if(ends[10]>=biggest6494){
                      biggest6494=ends[10];
                    }
                    if(ends[11]>=biggest6494){
                      biggest6494=ends[11];
                    }
                    if(biggest6494 == 1){
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    //FINXME code
                    if(biggest6494 == 0){
                      System.out.println("InletOff");//sysj\controllerFiller.sysj line: 52, column: 5
                      S5555=0;
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                  }
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6477(int [] tdone, int [] ends){
        switch(S5313){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(dosUnitValveExtendM.getprestatus()){//sysj\controllerFiller.sysj line: 22, column: 26
          dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 22, column: 47
          currsigs.addElement(dosUnitValveExtend);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread6476(int [] tdone, int [] ends){
        switch(S5305){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(dosUnitValveRetractM.getprestatus()){//sysj\controllerFiller.sysj line: 20, column: 26
          dosUnitValveRetract.setPresent();//sysj\controllerFiller.sysj line: 20, column: 48
          currsigs.addElement(dosUnitValveRetract);
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread6475(int [] tdone, int [] ends){
        switch(S5297){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(valveInletOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 18, column: 26
          valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 18, column: 44
          currsigs.addElement(valveInletOnOff);
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread6474(int [] tdone, int [] ends){
        switch(S5289){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S5283){
          case 0 : 
            S5283=0;
            if(valveInjectorOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 16, column: 26
              valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 16, column: 47
              currsigs.addElement(valveInjectorOnOff);
              S5283=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S5283=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S5283=1;
            S5283=0;
            if(valveInjectorOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 16, column: 26
              valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 16, column: 47
              currsigs.addElement(valveInjectorOnOff);
              S5283=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S5283=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6472(int [] tdone, int [] ends){
        S5313=1;
    if(dosUnitValveExtendM.getprestatus()){//sysj\controllerFiller.sysj line: 22, column: 26
      dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 22, column: 47
      currsigs.addElement(dosUnitValveExtend);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread6471(int [] tdone, int [] ends){
        S5305=1;
    if(dosUnitValveRetractM.getprestatus()){//sysj\controllerFiller.sysj line: 20, column: 26
      dosUnitValveRetract.setPresent();//sysj\controllerFiller.sysj line: 20, column: 48
      currsigs.addElement(dosUnitValveRetract);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread6470(int [] tdone, int [] ends){
        S5297=1;
    if(valveInletOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 18, column: 26
      valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 18, column: 44
      currsigs.addElement(valveInletOnOff);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread6469(int [] tdone, int [] ends){
        S5289=1;
    S5283=0;
    if(valveInjectorOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 16, column: 26
      valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 16, column: 47
      currsigs.addElement(valveInjectorOnOff);
      S5283=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S5283=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread6468(int [] tdone, int [] ends){
        switch(S5553){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S5281){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerFiller.sysj line: 13, column: 10
              System.out.println((mode.getpreval() == null ? null : ((Integer)mode.getpreval())));//sysj\controllerFiller.sysj line: 14, column: 4
              S5281=1;
              thread6469(tdone,ends);
              thread6470(tdone,ends);
              thread6471(tdone,ends);
              thread6472(tdone,ends);
              int biggest6473 = 0;
              if(ends[3]>=biggest6473){
                biggest6473=ends[3];
              }
              if(ends[4]>=biggest6473){
                biggest6473=ends[4];
              }
              if(ends[5]>=biggest6473){
                biggest6473=ends[5];
              }
              if(ends[6]>=biggest6473){
                biggest6473=ends[6];
              }
              if(biggest6473 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(selectA_1.getprestatus()){//sysj\controllerFiller.sysj line: 15, column: 10
              S5281=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread6474(tdone,ends);
              thread6475(tdone,ends);
              thread6476(tdone,ends);
              thread6477(tdone,ends);
              int biggest6478 = 0;
              if(ends[3]>=biggest6478){
                biggest6478=ends[3];
              }
              if(ends[4]>=biggest6478){
                biggest6478=ends[4];
              }
              if(ends[5]>=biggest6478){
                biggest6478=ends[5];
              }
              if(ends[6]>=biggest6478){
                biggest6478=ends[6];
              }
              if(biggest6478 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest6478 == 0){
                S5281=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6466(int [] tdone, int [] ends){
        S6460=1;
    S6459=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread6465(int [] tdone, int [] ends){
        S6445=1;
    S5555=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread6464(int [] tdone, int [] ends){
        S5553=1;
    S5281=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S6462){
        case 0 : 
          S6462=0;
          break RUN;
        
        case 1 : 
          S6462=2;
          S6462=2;
          selectM_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          thread6464(tdone,ends);
          thread6465(tdone,ends);
          thread6466(tdone,ends);
          int biggest6467 = 0;
          if(ends[2]>=biggest6467){
            biggest6467=ends[2];
          }
          if(ends[7]>=biggest6467){
            biggest6467=ends[7];
          }
          if(ends[12]>=biggest6467){
            biggest6467=ends[12];
          }
          if(biggest6467 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          thread6468(tdone,ends);
          thread6479(tdone,ends);
          thread6495(tdone,ends);
          int biggest6496 = 0;
          if(ends[2]>=biggest6496){
            biggest6496=ends[2];
          }
          if(ends[7]>=biggest6496){
            biggest6496=ends[7];
          }
          if(ends[12]>=biggest6496){
            biggest6496=ends[12];
          }
          if(biggest6496 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest6496 == 0){
            S6462=0;
            active[1]=0;
            ends[1]=0;
            S6462=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    selectM_1 = new Signal();
    selectA_1 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          bottleAtPos2.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          mode.gethook();
          valveInjectorOnOffM.gethook();
          valveInletOnOffM.gethook();
          dosUnitValveRetractM.gethook();
          dosUnitValveExtendM.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      mode.setpreclear();
      valveInjectorOnOffM.setpreclear();
      valveInletOnOffM.setpreclear();
      dosUnitValveRetractM.setpreclear();
      dosUnitValveExtendM.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      selectM_1.setpreclear();
      selectA_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos2.getStatus() ? bottleAtPos2.setprepresent() : bottleAtPos2.setpreclear();
      bottleAtPos2.setpreval(bottleAtPos2.getValue());
      bottleAtPos2.setClear();
      dummyint = dosUnitEvac.getStatus() ? dosUnitEvac.setprepresent() : dosUnitEvac.setpreclear();
      dosUnitEvac.setpreval(dosUnitEvac.getValue());
      dosUnitEvac.setClear();
      dummyint = dosUnitFilled.getStatus() ? dosUnitFilled.setprepresent() : dosUnitFilled.setpreclear();
      dosUnitFilled.setpreval(dosUnitFilled.getValue());
      dosUnitFilled.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = valveInjectorOnOffM.getStatus() ? valveInjectorOnOffM.setprepresent() : valveInjectorOnOffM.setpreclear();
      valveInjectorOnOffM.setpreval(valveInjectorOnOffM.getValue());
      valveInjectorOnOffM.setClear();
      dummyint = valveInletOnOffM.getStatus() ? valveInletOnOffM.setprepresent() : valveInletOnOffM.setpreclear();
      valveInletOnOffM.setpreval(valveInletOnOffM.getValue());
      valveInletOnOffM.setClear();
      dummyint = dosUnitValveRetractM.getStatus() ? dosUnitValveRetractM.setprepresent() : dosUnitValveRetractM.setpreclear();
      dosUnitValveRetractM.setpreval(dosUnitValveRetractM.getValue());
      dosUnitValveRetractM.setClear();
      dummyint = dosUnitValveExtendM.getStatus() ? dosUnitValveExtendM.setprepresent() : dosUnitValveExtendM.setpreclear();
      dosUnitValveExtendM.setpreval(dosUnitValveExtendM.getValue());
      dosUnitValveExtendM.setClear();
      valveInjectorOnOff.sethook();
      valveInjectorOnOff.setClear();
      valveInletOnOff.sethook();
      valveInletOnOff.setClear();
      dosUnitValveRetract.sethook();
      dosUnitValveRetract.setClear();
      dosUnitValveExtend.sethook();
      dosUnitValveExtend.setClear();
      selectM_1.setClear();
      selectA_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos2.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
        mode.gethook();
        valveInjectorOnOffM.gethook();
        valveInletOnOffM.gethook();
        dosUnitValveRetractM.gethook();
        dosUnitValveExtendM.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
