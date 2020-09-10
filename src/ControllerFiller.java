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
  private int S2152 = 1;
  private int S1243 = 1;
  private int S971 = 1;
  private int S979 = 1;
  private int S973 = 1;
  private int S987 = 1;
  private int S995 = 1;
  private int S1003 = 1;
  private int S2135 = 1;
  private int S1245 = 1;
  private int S1281 = 1;
  private int S1254 = 1;
  private int S1262 = 1;
  private int S1289 = 1;
  private int S1297 = 1;
  private int S2150 = 1;
  private int S2149 = 1;
  
  private int[] ends = new int[13];
  private int[] tdone = new int[13];
  
  public void thread2185(int [] tdone, int [] ends){
        switch(S2150){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S2149){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerFiller.sysj line: 58, column: 9
              S2149=1;
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

  public void thread2183(int [] tdone, int [] ends){
        switch(S1297){
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

  public void thread2182(int [] tdone, int [] ends){
        switch(S1289){
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

  public void thread2180(int [] tdone, int [] ends){
        S1297=1;
    System.out.println("InletOn");//sysj\controllerFiller.sysj line: 48, column: 7
    valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 49, column: 6
    currsigs.addElement(valveInletOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread2179(int [] tdone, int [] ends){
        S1289=1;
    System.out.println("ValveExtend");//sysj\controllerFiller.sysj line: 44, column: 7
    dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 45, column: 6
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2177(int [] tdone, int [] ends){
        switch(S1262){
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

  public void thread2176(int [] tdone, int [] ends){
        switch(S1254){
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

  public void thread2174(int [] tdone, int [] ends){
        S1297=1;
    System.out.println("InletOn");//sysj\controllerFiller.sysj line: 48, column: 7
    valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 49, column: 6
    currsigs.addElement(valveInletOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread2173(int [] tdone, int [] ends){
        S1289=1;
    System.out.println("ValveExtend");//sysj\controllerFiller.sysj line: 44, column: 7
    dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 45, column: 6
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2171(int [] tdone, int [] ends){
        S1262=1;
    System.out.println("InjectorOn");//sysj\controllerFiller.sysj line: 38, column: 7
    valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 39, column: 6
    currsigs.addElement(valveInjectorOnOff);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2170(int [] tdone, int [] ends){
        S1254=1;
    System.out.println("ValveRetract");//sysj\controllerFiller.sysj line: 34, column: 7
    dosUnitValveRetract.setPresent();//sysj\controllerFiller.sysj line: 35, column: 6
    currsigs.addElement(dosUnitValveRetract);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread2169(int [] tdone, int [] ends){
        switch(S2135){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S1245){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerFiller.sysj line: 29, column: 9
              System.out.println((mode.getpreval() == null ? null : ((Integer)mode.getpreval())));//sysj\controllerFiller.sysj line: 30, column: 3
              S1245=1;
              S1281=0;
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
              S1245=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              switch(S1281){
                case 0 : 
                  if(bottleAtPos2.getprestatus()){//sysj\controllerFiller.sysj line: 32, column: 11
                    S1281=1;
                    thread2170(tdone,ends);
                    thread2171(tdone,ends);
                    int biggest2172 = 0;
                    if(ends[8]>=biggest2172){
                      biggest2172=ends[8];
                    }
                    if(ends[9]>=biggest2172){
                      biggest2172=ends[9];
                    }
                    if(biggest2172 == 1){
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
                    S1281=2;
                    thread2173(tdone,ends);
                    thread2174(tdone,ends);
                    int biggest2175 = 0;
                    if(ends[10]>=biggest2175){
                      biggest2175=ends[10];
                    }
                    if(ends[11]>=biggest2175){
                      biggest2175=ends[11];
                    }
                    if(biggest2175 == 1){
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                  }
                  else {
                    thread2176(tdone,ends);
                    thread2177(tdone,ends);
                    int biggest2178 = 0;
                    if(ends[8]>=biggest2178){
                      biggest2178=ends[8];
                    }
                    if(ends[9]>=biggest2178){
                      biggest2178=ends[9];
                    }
                    if(biggest2178 == 1){
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    //FINXME code
                    if(biggest2178 == 0){
                      System.out.println("InjectorOff");//sysj\controllerFiller.sysj line: 42, column: 5
                      S1281=2;
                      thread2179(tdone,ends);
                      thread2180(tdone,ends);
                      int biggest2181 = 0;
                      if(ends[10]>=biggest2181){
                        biggest2181=ends[10];
                      }
                      if(ends[11]>=biggest2181){
                        biggest2181=ends[11];
                      }
                      if(biggest2181 == 1){
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
                    S1245=0;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    thread2182(tdone,ends);
                    thread2183(tdone,ends);
                    int biggest2184 = 0;
                    if(ends[10]>=biggest2184){
                      biggest2184=ends[10];
                    }
                    if(ends[11]>=biggest2184){
                      biggest2184=ends[11];
                    }
                    if(biggest2184 == 1){
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    //FINXME code
                    if(biggest2184 == 0){
                      System.out.println("InletOff");//sysj\controllerFiller.sysj line: 52, column: 5
                      S1245=0;
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

  public void thread2167(int [] tdone, int [] ends){
        switch(S1003){
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

  public void thread2166(int [] tdone, int [] ends){
        switch(S995){
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

  public void thread2165(int [] tdone, int [] ends){
        switch(S987){
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

  public void thread2164(int [] tdone, int [] ends){
        switch(S979){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S973){
          case 0 : 
            S973=0;
            if(valveInjectorOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 16, column: 26
              valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 16, column: 47
              currsigs.addElement(valveInjectorOnOff);
              S973=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S973=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S973=1;
            S973=0;
            if(valveInjectorOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 16, column: 26
              valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 16, column: 47
              currsigs.addElement(valveInjectorOnOff);
              S973=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S973=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2162(int [] tdone, int [] ends){
        S1003=1;
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

  public void thread2161(int [] tdone, int [] ends){
        S995=1;
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

  public void thread2160(int [] tdone, int [] ends){
        S987=1;
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

  public void thread2159(int [] tdone, int [] ends){
        S979=1;
    S973=0;
    if(valveInjectorOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 16, column: 26
      valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 16, column: 47
      currsigs.addElement(valveInjectorOnOff);
      S973=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S973=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread2158(int [] tdone, int [] ends){
        switch(S1243){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S971){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerFiller.sysj line: 13, column: 10
              System.out.println((mode.getpreval() == null ? null : ((Integer)mode.getpreval())));//sysj\controllerFiller.sysj line: 14, column: 4
              S971=1;
              thread2159(tdone,ends);
              thread2160(tdone,ends);
              thread2161(tdone,ends);
              thread2162(tdone,ends);
              int biggest2163 = 0;
              if(ends[3]>=biggest2163){
                biggest2163=ends[3];
              }
              if(ends[4]>=biggest2163){
                biggest2163=ends[4];
              }
              if(ends[5]>=biggest2163){
                biggest2163=ends[5];
              }
              if(ends[6]>=biggest2163){
                biggest2163=ends[6];
              }
              if(biggest2163 == 1){
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
              S971=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread2164(tdone,ends);
              thread2165(tdone,ends);
              thread2166(tdone,ends);
              thread2167(tdone,ends);
              int biggest2168 = 0;
              if(ends[3]>=biggest2168){
                biggest2168=ends[3];
              }
              if(ends[4]>=biggest2168){
                biggest2168=ends[4];
              }
              if(ends[5]>=biggest2168){
                biggest2168=ends[5];
              }
              if(ends[6]>=biggest2168){
                biggest2168=ends[6];
              }
              if(biggest2168 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest2168 == 0){
                S971=0;
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

  public void thread2156(int [] tdone, int [] ends){
        S2150=1;
    S2149=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread2155(int [] tdone, int [] ends){
        S2135=1;
    S1245=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2154(int [] tdone, int [] ends){
        S1243=1;
    S971=0;
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
      switch(S2152){
        case 0 : 
          S2152=0;
          break RUN;
        
        case 1 : 
          S2152=2;
          S2152=2;
          selectM_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          thread2154(tdone,ends);
          thread2155(tdone,ends);
          thread2156(tdone,ends);
          int biggest2157 = 0;
          if(ends[2]>=biggest2157){
            biggest2157=ends[2];
          }
          if(ends[7]>=biggest2157){
            biggest2157=ends[7];
          }
          if(ends[12]>=biggest2157){
            biggest2157=ends[12];
          }
          if(biggest2157 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          thread2158(tdone,ends);
          thread2169(tdone,ends);
          thread2185(tdone,ends);
          int biggest2186 = 0;
          if(ends[2]>=biggest2186){
            biggest2186=ends[2];
          }
          if(ends[7]>=biggest2186){
            biggest2186=ends[7];
          }
          if(ends[12]>=biggest2186){
            biggest2186=ends[12];
          }
          if(biggest2186 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2186 == 0){
            S2152=0;
            active[1]=0;
            ends[1]=0;
            S2152=0;
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
