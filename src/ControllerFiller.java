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
  public Signal inletOff = new Signal("inletOff", Signal.INPUT);
  public Signal injectorOff = new Signal("injectorOff", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal valveInjectorOnOffM = new Signal("valveInjectorOnOffM", Signal.INPUT);
  public Signal valveInletOnOffM = new Signal("valveInletOnOffM", Signal.INPUT);
  public Signal dosUnitValveRetractM = new Signal("dosUnitValveRetractM", Signal.INPUT);
  public Signal dosUnitValveExtendM = new Signal("dosUnitValveExtendM", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public Signal jobDone = new Signal("jobDone", Signal.OUTPUT);
  private Signal selectM_1;
  private Signal selectA_1;
  private int S9260 = 1;
  private int S7801 = 1;
  private int S7595 = 1;
  private int S7536 = 1;
  private int S7530 = 1;
  private int S7544 = 1;
  private int S7552 = 1;
  private int S7560 = 1;
  private int S9243 = 1;
  private int S7981 = 1;
  private int S7826 = 1;
  private int S7808 = 1;
  private int S7813 = 1;
  private int S7831 = 1;
  private int S7836 = 1;
  private int S7841 = 1;
  private int S9258 = 1;
  private int S9257 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread9300(int [] tdone, int [] ends){
        switch(S9258){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S9257){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerFiller.sysj line: 53, column: 9
              S9257=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerFiller.sysj line: 55, column: 7
                selectM_1.setPresent();//sysj\controllerFiller.sysj line: 56, column: 5
                currsigs.addElement(selectM_1);
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
              else {
                selectA_1.setPresent();//sysj\controllerFiller.sysj line: 59, column: 5
                currsigs.addElement(selectA_1);
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
            else {
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerFiller.sysj line: 55, column: 7
              selectM_1.setPresent();//sysj\controllerFiller.sysj line: 56, column: 5
              currsigs.addElement(selectM_1);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              selectA_1.setPresent();//sysj\controllerFiller.sysj line: 59, column: 5
              currsigs.addElement(selectA_1);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread9298(int [] tdone, int [] ends){
        switch(S7841){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        jobDone.setPresent();//sysj\controllerFiller.sysj line: 46, column: 6
        currsigs.addElement(jobDone);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread9297(int [] tdone, int [] ends){
        switch(S7836){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 43, column: 6
        currsigs.addElement(valveInletOnOff);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread9296(int [] tdone, int [] ends){
        switch(S7831){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 40, column: 6
        currsigs.addElement(dosUnitValveExtend);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread9294(int [] tdone, int [] ends){
        S7841=1;
    jobDone.setPresent();//sysj\controllerFiller.sysj line: 46, column: 6
    currsigs.addElement(jobDone);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread9293(int [] tdone, int [] ends){
        S7836=1;
    valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 43, column: 6
    currsigs.addElement(valveInletOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread9292(int [] tdone, int [] ends){
        S7831=1;
    dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 40, column: 6
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread9290(int [] tdone, int [] ends){
        switch(S7813){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 36, column: 6
        currsigs.addElement(valveInjectorOnOff);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread9289(int [] tdone, int [] ends){
        switch(S7808){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\controllerFiller.sysj line: 33, column: 6
        currsigs.addElement(dosUnitValveRetract);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread9287(int [] tdone, int [] ends){
        S7841=1;
    jobDone.setPresent();//sysj\controllerFiller.sysj line: 46, column: 6
    currsigs.addElement(jobDone);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread9286(int [] tdone, int [] ends){
        S7836=1;
    valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 43, column: 6
    currsigs.addElement(valveInletOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread9285(int [] tdone, int [] ends){
        S7831=1;
    dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 40, column: 6
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread9283(int [] tdone, int [] ends){
        S7813=1;
    valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 36, column: 6
    currsigs.addElement(valveInjectorOnOff);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread9282(int [] tdone, int [] ends){
        S7808=1;
    dosUnitValveRetract.setPresent();//sysj\controllerFiller.sysj line: 33, column: 6
    currsigs.addElement(dosUnitValveRetract);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread9280(int [] tdone, int [] ends){
        S7841=1;
    jobDone.setPresent();//sysj\controllerFiller.sysj line: 46, column: 6
    currsigs.addElement(jobDone);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread9279(int [] tdone, int [] ends){
        S7836=1;
    valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 43, column: 6
    currsigs.addElement(valveInletOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread9278(int [] tdone, int [] ends){
        S7831=1;
    dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 40, column: 6
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread9277(int [] tdone, int [] ends){
        switch(S9243){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S7981){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerFiller.sysj line: 28, column: 9
              S7981=1;
              S7826=0;
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
            if(selectM_1.getprestatus()){//sysj\controllerFiller.sysj line: 29, column: 10
              S7981=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              switch(S7826){
                case 0 : 
                  if(bottleAtPos2.getprestatus()){//sysj\controllerFiller.sysj line: 30, column: 11
                    S7826=1;
                    if((dosUnitFilled.getprestatus())){//sysj\controllerFiller.sysj line: 31, column: 21
                      S7826=2;
                      if((dosUnitEvac.getprestatus())){//sysj\controllerFiller.sysj line: 38, column: 21
                        S7981=0;
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      else {
                        thread9278(tdone,ends);
                        thread9279(tdone,ends);
                        thread9280(tdone,ends);
                        int biggest9281 = 0;
                        if(ends[10]>=biggest9281){
                          biggest9281=ends[10];
                        }
                        if(ends[11]>=biggest9281){
                          biggest9281=ends[11];
                        }
                        if(ends[12]>=biggest9281){
                          biggest9281=ends[12];
                        }
                        if(biggest9281 == 1){
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                      }
                    }
                    else {
                      thread9282(tdone,ends);
                      thread9283(tdone,ends);
                      int biggest9284 = 0;
                      if(ends[8]>=biggest9284){
                        biggest9284=ends[8];
                      }
                      if(ends[9]>=biggest9284){
                        biggest9284=ends[9];
                      }
                      if(biggest9284 == 1){
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                    }
                  }
                  else {
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  break;
                
                case 1 : 
                  if((dosUnitFilled.getprestatus())){//sysj\controllerFiller.sysj line: 31, column: 21
                    S7826=2;
                    if((dosUnitEvac.getprestatus())){//sysj\controllerFiller.sysj line: 38, column: 21
                      S7981=0;
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    else {
                      thread9285(tdone,ends);
                      thread9286(tdone,ends);
                      thread9287(tdone,ends);
                      int biggest9288 = 0;
                      if(ends[10]>=biggest9288){
                        biggest9288=ends[10];
                      }
                      if(ends[11]>=biggest9288){
                        biggest9288=ends[11];
                      }
                      if(ends[12]>=biggest9288){
                        biggest9288=ends[12];
                      }
                      if(biggest9288 == 1){
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                    }
                  }
                  else {
                    thread9289(tdone,ends);
                    thread9290(tdone,ends);
                    int biggest9291 = 0;
                    if(ends[8]>=biggest9291){
                      biggest9291=ends[8];
                    }
                    if(ends[9]>=biggest9291){
                      biggest9291=ends[9];
                    }
                    if(biggest9291 == 1){
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    //FINXME code
                    if(biggest9291 == 0){
                      S7826=2;
                      if((dosUnitEvac.getprestatus())){//sysj\controllerFiller.sysj line: 38, column: 21
                        S7981=0;
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      else {
                        thread9292(tdone,ends);
                        thread9293(tdone,ends);
                        thread9294(tdone,ends);
                        int biggest9295 = 0;
                        if(ends[10]>=biggest9295){
                          biggest9295=ends[10];
                        }
                        if(ends[11]>=biggest9295){
                          biggest9295=ends[11];
                        }
                        if(ends[12]>=biggest9295){
                          biggest9295=ends[12];
                        }
                        if(biggest9295 == 1){
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                      }
                    }
                  }
                  break;
                
                case 2 : 
                  if((dosUnitEvac.getprestatus())){//sysj\controllerFiller.sysj line: 38, column: 21
                    S7981=0;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    thread9296(tdone,ends);
                    thread9297(tdone,ends);
                    thread9298(tdone,ends);
                    int biggest9299 = 0;
                    if(ends[10]>=biggest9299){
                      biggest9299=ends[10];
                    }
                    if(ends[11]>=biggest9299){
                      biggest9299=ends[11];
                    }
                    if(ends[12]>=biggest9299){
                      biggest9299=ends[12];
                    }
                    if(biggest9299 == 1){
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    //FINXME code
                    if(biggest9299 == 0){
                      S7981=0;
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

  public void thread9275(int [] tdone, int [] ends){
        switch(S7560){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(dosUnitValveExtendM.getprestatus()){//sysj\controllerFiller.sysj line: 21, column: 26
          dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 21, column: 47
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

  public void thread9274(int [] tdone, int [] ends){
        switch(S7552){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(dosUnitValveRetractM.getprestatus()){//sysj\controllerFiller.sysj line: 19, column: 26
          dosUnitValveRetract.setPresent();//sysj\controllerFiller.sysj line: 19, column: 48
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

  public void thread9273(int [] tdone, int [] ends){
        switch(S7544){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(valveInletOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 17, column: 26
          valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 17, column: 44
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

  public void thread9272(int [] tdone, int [] ends){
        switch(S7536){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S7530){
          case 0 : 
            S7530=0;
            if(valveInjectorOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 15, column: 26
              valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 15, column: 47
              currsigs.addElement(valveInjectorOnOff);
              S7530=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S7530=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S7530=1;
            S7530=0;
            if(valveInjectorOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 15, column: 26
              valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 15, column: 47
              currsigs.addElement(valveInjectorOnOff);
              S7530=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S7530=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread9270(int [] tdone, int [] ends){
        S7560=1;
    if(dosUnitValveExtendM.getprestatus()){//sysj\controllerFiller.sysj line: 21, column: 26
      dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 21, column: 47
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

  public void thread9269(int [] tdone, int [] ends){
        S7552=1;
    if(dosUnitValveRetractM.getprestatus()){//sysj\controllerFiller.sysj line: 19, column: 26
      dosUnitValveRetract.setPresent();//sysj\controllerFiller.sysj line: 19, column: 48
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

  public void thread9268(int [] tdone, int [] ends){
        S7544=1;
    if(valveInletOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 17, column: 26
      valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 17, column: 44
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

  public void thread9267(int [] tdone, int [] ends){
        S7536=1;
    S7530=0;
    if(valveInjectorOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 15, column: 26
      valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 15, column: 47
      currsigs.addElement(valveInjectorOnOff);
      S7530=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S7530=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread9266(int [] tdone, int [] ends){
        switch(S7801){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S7595){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerFiller.sysj line: 13, column: 10
              S7595=1;
              thread9267(tdone,ends);
              thread9268(tdone,ends);
              thread9269(tdone,ends);
              thread9270(tdone,ends);
              int biggest9271 = 0;
              if(ends[3]>=biggest9271){
                biggest9271=ends[3];
              }
              if(ends[4]>=biggest9271){
                biggest9271=ends[4];
              }
              if(ends[5]>=biggest9271){
                biggest9271=ends[5];
              }
              if(ends[6]>=biggest9271){
                biggest9271=ends[6];
              }
              if(biggest9271 == 1){
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
            if(selectA_1.getprestatus()){//sysj\controllerFiller.sysj line: 14, column: 10
              S7595=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread9272(tdone,ends);
              thread9273(tdone,ends);
              thread9274(tdone,ends);
              thread9275(tdone,ends);
              int biggest9276 = 0;
              if(ends[3]>=biggest9276){
                biggest9276=ends[3];
              }
              if(ends[4]>=biggest9276){
                biggest9276=ends[4];
              }
              if(ends[5]>=biggest9276){
                biggest9276=ends[5];
              }
              if(ends[6]>=biggest9276){
                biggest9276=ends[6];
              }
              if(biggest9276 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest9276 == 0){
                S7595=0;
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

  public void thread9264(int [] tdone, int [] ends){
        S9258=1;
    S9257=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread9263(int [] tdone, int [] ends){
        S9243=1;
    S7981=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread9262(int [] tdone, int [] ends){
        S7801=1;
    S7595=0;
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
      switch(S9260){
        case 0 : 
          S9260=0;
          break RUN;
        
        case 1 : 
          S9260=2;
          S9260=2;
          selectM_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          thread9262(tdone,ends);
          thread9263(tdone,ends);
          thread9264(tdone,ends);
          int biggest9265 = 0;
          if(ends[2]>=biggest9265){
            biggest9265=ends[2];
          }
          if(ends[7]>=biggest9265){
            biggest9265=ends[7];
          }
          if(ends[13]>=biggest9265){
            biggest9265=ends[13];
          }
          if(biggest9265 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          thread9266(tdone,ends);
          thread9277(tdone,ends);
          thread9300(tdone,ends);
          int biggest9301 = 0;
          if(ends[2]>=biggest9301){
            biggest9301=ends[2];
          }
          if(ends[7]>=biggest9301){
            biggest9301=ends[7];
          }
          if(ends[13]>=biggest9301){
            biggest9301=ends[13];
          }
          if(biggest9301 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest9301 == 0){
            S9260=0;
            active[1]=0;
            ends[1]=0;
            S9260=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          inletOff.gethook();
          injectorOff.gethook();
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
      inletOff.setpreclear();
      injectorOff.setpreclear();
      mode.setpreclear();
      valveInjectorOnOffM.setpreclear();
      valveInletOnOffM.setpreclear();
      dosUnitValveRetractM.setpreclear();
      dosUnitValveExtendM.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      jobDone.setpreclear();
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
      dummyint = inletOff.getStatus() ? inletOff.setprepresent() : inletOff.setpreclear();
      inletOff.setpreval(inletOff.getValue());
      inletOff.setClear();
      dummyint = injectorOff.getStatus() ? injectorOff.setprepresent() : injectorOff.setpreclear();
      injectorOff.setpreval(injectorOff.getValue());
      injectorOff.setClear();
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
      jobDone.sethook();
      jobDone.setClear();
      selectM_1.setClear();
      selectA_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos2.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
        inletOff.gethook();
        injectorOff.gethook();
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
