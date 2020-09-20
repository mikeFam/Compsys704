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
  public Signal jobDoneM = new Signal("jobDoneM", Signal.OUTPUT);
  private Signal selectM_1;
  private Signal selectA_1;
  private int S7656 = 1;
  private int S4781 = 1;
  private int S4575 = 1;
  private int S4516 = 1;
  private int S4510 = 1;
  private int S4524 = 1;
  private int S4532 = 1;
  private int S4540 = 1;
  private int S7639 = 1;
  private int S5257 = 1;
  private int S5018 = 1;
  private int S4839 = 1;
  private int S4788 = 1;
  private int S4793 = 1;
  private int S4799 = 1;
  private int S4804 = 1;
  private int S4844 = 1;
  private int S4849 = 1;
  private int S7654 = 1;
  private int S7653 = 1;
  
  private int[] ends = new int[15];
  private int[] tdone = new int[15];
  
  public void thread7710(int [] tdone, int [] ends){
        switch(S7654){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S7653){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerFiller.sysj line: 55, column: 9
              S7653=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerFiller.sysj line: 57, column: 7
                selectM_1.setPresent();//sysj\controllerFiller.sysj line: 58, column: 5
                currsigs.addElement(selectM_1);
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
              else {
                selectA_1.setPresent();//sysj\controllerFiller.sysj line: 61, column: 5
                currsigs.addElement(selectA_1);
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerFiller.sysj line: 57, column: 7
              selectM_1.setPresent();//sysj\controllerFiller.sysj line: 58, column: 5
              currsigs.addElement(selectM_1);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              selectA_1.setPresent();//sysj\controllerFiller.sysj line: 61, column: 5
              currsigs.addElement(selectA_1);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread7708(int [] tdone, int [] ends){
        switch(S4849){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        jobDoneM.setPresent();//sysj\controllerFiller.sysj line: 48, column: 7
        currsigs.addElement(jobDoneM);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread7707(int [] tdone, int [] ends){
        switch(S4844){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        jobDone.setPresent();//sysj\controllerFiller.sysj line: 46, column: 7
        currsigs.addElement(jobDone);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread7705(int [] tdone, int [] ends){
        S4849=1;
    jobDoneM.setPresent();//sysj\controllerFiller.sysj line: 48, column: 7
    currsigs.addElement(jobDoneM);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread7704(int [] tdone, int [] ends){
        S4844=1;
    jobDone.setPresent();//sysj\controllerFiller.sysj line: 46, column: 7
    currsigs.addElement(jobDone);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread7702(int [] tdone, int [] ends){
        switch(S4804){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 44, column: 7
        currsigs.addElement(valveInletOnOff);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread7701(int [] tdone, int [] ends){
        switch(S4799){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 41, column: 7
        currsigs.addElement(dosUnitValveExtend);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread7699(int [] tdone, int [] ends){
        S4849=1;
    jobDoneM.setPresent();//sysj\controllerFiller.sysj line: 48, column: 7
    currsigs.addElement(jobDoneM);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread7698(int [] tdone, int [] ends){
        S4844=1;
    jobDone.setPresent();//sysj\controllerFiller.sysj line: 46, column: 7
    currsigs.addElement(jobDone);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread7696(int [] tdone, int [] ends){
        S4804=1;
    valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 44, column: 7
    currsigs.addElement(valveInletOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread7695(int [] tdone, int [] ends){
        S4799=1;
    dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 41, column: 7
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread7693(int [] tdone, int [] ends){
        S4849=1;
    jobDoneM.setPresent();//sysj\controllerFiller.sysj line: 48, column: 7
    currsigs.addElement(jobDoneM);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread7692(int [] tdone, int [] ends){
        S4844=1;
    jobDone.setPresent();//sysj\controllerFiller.sysj line: 46, column: 7
    currsigs.addElement(jobDone);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread7690(int [] tdone, int [] ends){
        switch(S4793){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 37, column: 7
        currsigs.addElement(valveInjectorOnOff);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread7689(int [] tdone, int [] ends){
        switch(S4788){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\controllerFiller.sysj line: 34, column: 7
        currsigs.addElement(dosUnitValveRetract);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread7687(int [] tdone, int [] ends){
        S4804=1;
    valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 44, column: 7
    currsigs.addElement(valveInletOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread7686(int [] tdone, int [] ends){
        S4799=1;
    dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 41, column: 7
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread7684(int [] tdone, int [] ends){
        S4849=1;
    jobDoneM.setPresent();//sysj\controllerFiller.sysj line: 48, column: 7
    currsigs.addElement(jobDoneM);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread7683(int [] tdone, int [] ends){
        S4844=1;
    jobDone.setPresent();//sysj\controllerFiller.sysj line: 46, column: 7
    currsigs.addElement(jobDone);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread7681(int [] tdone, int [] ends){
        S4793=1;
    valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 37, column: 7
    currsigs.addElement(valveInjectorOnOff);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread7680(int [] tdone, int [] ends){
        S4788=1;
    dosUnitValveRetract.setPresent();//sysj\controllerFiller.sysj line: 34, column: 7
    currsigs.addElement(dosUnitValveRetract);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread7678(int [] tdone, int [] ends){
        S4804=1;
    valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 44, column: 7
    currsigs.addElement(valveInletOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread7677(int [] tdone, int [] ends){
        S4799=1;
    dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 41, column: 7
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread7675(int [] tdone, int [] ends){
        S4849=1;
    jobDoneM.setPresent();//sysj\controllerFiller.sysj line: 48, column: 7
    currsigs.addElement(jobDoneM);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread7674(int [] tdone, int [] ends){
        S4844=1;
    jobDone.setPresent();//sysj\controllerFiller.sysj line: 46, column: 7
    currsigs.addElement(jobDone);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread7673(int [] tdone, int [] ends){
        switch(S7639){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S5257){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerFiller.sysj line: 28, column: 9
              S5257=1;
              S5018=0;
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
              S5257=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              switch(S5018){
                case 0 : 
                  if(bottleAtPos2.getprestatus()){//sysj\controllerFiller.sysj line: 30, column: 11
                    S5018=1;
                    if((!bottleAtPos2.getprestatus())){//sysj\controllerFiller.sysj line: 31, column: 21
                      S5257=0;
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    else {
                      S4839=0;
                      if((dosUnitFilled.getprestatus())){//sysj\controllerFiller.sysj line: 32, column: 22
                        S4839=1;
                        if((dosUnitEvac.getprestatus())){//sysj\controllerFiller.sysj line: 39, column: 22
                          S4839=2;
                          thread7674(tdone,ends);
                          thread7675(tdone,ends);
                          int biggest7676 = 0;
                          if(ends[12]>=biggest7676){
                            biggest7676=ends[12];
                          }
                          if(ends[13]>=biggest7676){
                            biggest7676=ends[13];
                          }
                          if(biggest7676 == 1){
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                        }
                        else {
                          thread7677(tdone,ends);
                          thread7678(tdone,ends);
                          int biggest7679 = 0;
                          if(ends[10]>=biggest7679){
                            biggest7679=ends[10];
                          }
                          if(ends[11]>=biggest7679){
                            biggest7679=ends[11];
                          }
                          if(biggest7679 == 1){
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                        }
                      }
                      else {
                        thread7680(tdone,ends);
                        thread7681(tdone,ends);
                        int biggest7682 = 0;
                        if(ends[8]>=biggest7682){
                          biggest7682=ends[8];
                        }
                        if(ends[9]>=biggest7682){
                          biggest7682=ends[9];
                        }
                        if(biggest7682 == 1){
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
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
                  if((!bottleAtPos2.getprestatus())){//sysj\controllerFiller.sysj line: 31, column: 21
                    S5257=0;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    switch(S4839){
                      case 0 : 
                        if((dosUnitFilled.getprestatus())){//sysj\controllerFiller.sysj line: 32, column: 22
                          S4839=1;
                          if((dosUnitEvac.getprestatus())){//sysj\controllerFiller.sysj line: 39, column: 22
                            S4839=2;
                            thread7683(tdone,ends);
                            thread7684(tdone,ends);
                            int biggest7685 = 0;
                            if(ends[12]>=biggest7685){
                              biggest7685=ends[12];
                            }
                            if(ends[13]>=biggest7685){
                              biggest7685=ends[13];
                            }
                            if(biggest7685 == 1){
                              active[7]=1;
                              ends[7]=1;
                              tdone[7]=1;
                            }
                          }
                          else {
                            thread7686(tdone,ends);
                            thread7687(tdone,ends);
                            int biggest7688 = 0;
                            if(ends[10]>=biggest7688){
                              biggest7688=ends[10];
                            }
                            if(ends[11]>=biggest7688){
                              biggest7688=ends[11];
                            }
                            if(biggest7688 == 1){
                              active[7]=1;
                              ends[7]=1;
                              tdone[7]=1;
                            }
                          }
                        }
                        else {
                          thread7689(tdone,ends);
                          thread7690(tdone,ends);
                          int biggest7691 = 0;
                          if(ends[8]>=biggest7691){
                            biggest7691=ends[8];
                          }
                          if(ends[9]>=biggest7691){
                            biggest7691=ends[9];
                          }
                          if(biggest7691 == 1){
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                          //FINXME code
                          if(biggest7691 == 0){
                            S4839=1;
                            if((dosUnitEvac.getprestatus())){//sysj\controllerFiller.sysj line: 39, column: 22
                              S4839=2;
                              thread7692(tdone,ends);
                              thread7693(tdone,ends);
                              int biggest7694 = 0;
                              if(ends[12]>=biggest7694){
                                biggest7694=ends[12];
                              }
                              if(ends[13]>=biggest7694){
                                biggest7694=ends[13];
                              }
                              if(biggest7694 == 1){
                                active[7]=1;
                                ends[7]=1;
                                tdone[7]=1;
                              }
                            }
                            else {
                              thread7695(tdone,ends);
                              thread7696(tdone,ends);
                              int biggest7697 = 0;
                              if(ends[10]>=biggest7697){
                                biggest7697=ends[10];
                              }
                              if(ends[11]>=biggest7697){
                                biggest7697=ends[11];
                              }
                              if(biggest7697 == 1){
                                active[7]=1;
                                ends[7]=1;
                                tdone[7]=1;
                              }
                            }
                          }
                        }
                        break;
                      
                      case 1 : 
                        if((dosUnitEvac.getprestatus())){//sysj\controllerFiller.sysj line: 39, column: 22
                          S4839=2;
                          thread7698(tdone,ends);
                          thread7699(tdone,ends);
                          int biggest7700 = 0;
                          if(ends[12]>=biggest7700){
                            biggest7700=ends[12];
                          }
                          if(ends[13]>=biggest7700){
                            biggest7700=ends[13];
                          }
                          if(biggest7700 == 1){
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                        }
                        else {
                          thread7701(tdone,ends);
                          thread7702(tdone,ends);
                          int biggest7703 = 0;
                          if(ends[10]>=biggest7703){
                            biggest7703=ends[10];
                          }
                          if(ends[11]>=biggest7703){
                            biggest7703=ends[11];
                          }
                          if(biggest7703 == 1){
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                          //FINXME code
                          if(biggest7703 == 0){
                            S4839=2;
                            thread7704(tdone,ends);
                            thread7705(tdone,ends);
                            int biggest7706 = 0;
                            if(ends[12]>=biggest7706){
                              biggest7706=ends[12];
                            }
                            if(ends[13]>=biggest7706){
                              biggest7706=ends[13];
                            }
                            if(biggest7706 == 1){
                              active[7]=1;
                              ends[7]=1;
                              tdone[7]=1;
                            }
                          }
                        }
                        break;
                      
                      case 2 : 
                        thread7707(tdone,ends);
                        thread7708(tdone,ends);
                        int biggest7709 = 0;
                        if(ends[12]>=biggest7709){
                          biggest7709=ends[12];
                        }
                        if(ends[13]>=biggest7709){
                          biggest7709=ends[13];
                        }
                        if(biggest7709 == 1){
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                        //FINXME code
                        if(biggest7709 == 0){
                          S5257=0;
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                        break;
                      
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

  public void thread7671(int [] tdone, int [] ends){
        switch(S4540){
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

  public void thread7670(int [] tdone, int [] ends){
        switch(S4532){
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

  public void thread7669(int [] tdone, int [] ends){
        switch(S4524){
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

  public void thread7668(int [] tdone, int [] ends){
        switch(S4516){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S4510){
          case 0 : 
            S4510=0;
            if(valveInjectorOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 15, column: 26
              valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 15, column: 47
              currsigs.addElement(valveInjectorOnOff);
              S4510=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S4510=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S4510=1;
            S4510=0;
            if(valveInjectorOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 15, column: 26
              valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 15, column: 47
              currsigs.addElement(valveInjectorOnOff);
              S4510=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S4510=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread7666(int [] tdone, int [] ends){
        S4540=1;
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

  public void thread7665(int [] tdone, int [] ends){
        S4532=1;
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

  public void thread7664(int [] tdone, int [] ends){
        S4524=1;
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

  public void thread7663(int [] tdone, int [] ends){
        S4516=1;
    S4510=0;
    if(valveInjectorOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 15, column: 26
      valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 15, column: 47
      currsigs.addElement(valveInjectorOnOff);
      S4510=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S4510=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread7662(int [] tdone, int [] ends){
        switch(S4781){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S4575){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerFiller.sysj line: 13, column: 10
              S4575=1;
              thread7663(tdone,ends);
              thread7664(tdone,ends);
              thread7665(tdone,ends);
              thread7666(tdone,ends);
              int biggest7667 = 0;
              if(ends[3]>=biggest7667){
                biggest7667=ends[3];
              }
              if(ends[4]>=biggest7667){
                biggest7667=ends[4];
              }
              if(ends[5]>=biggest7667){
                biggest7667=ends[5];
              }
              if(ends[6]>=biggest7667){
                biggest7667=ends[6];
              }
              if(biggest7667 == 1){
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
              S4575=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread7668(tdone,ends);
              thread7669(tdone,ends);
              thread7670(tdone,ends);
              thread7671(tdone,ends);
              int biggest7672 = 0;
              if(ends[3]>=biggest7672){
                biggest7672=ends[3];
              }
              if(ends[4]>=biggest7672){
                biggest7672=ends[4];
              }
              if(ends[5]>=biggest7672){
                biggest7672=ends[5];
              }
              if(ends[6]>=biggest7672){
                biggest7672=ends[6];
              }
              if(biggest7672 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest7672 == 0){
                S4575=0;
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

  public void thread7660(int [] tdone, int [] ends){
        S7654=1;
    S7653=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread7659(int [] tdone, int [] ends){
        S7639=1;
    S5257=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread7658(int [] tdone, int [] ends){
        S4781=1;
    S4575=0;
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
      switch(S7656){
        case 0 : 
          S7656=0;
          break RUN;
        
        case 1 : 
          S7656=2;
          S7656=2;
          selectM_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          thread7658(tdone,ends);
          thread7659(tdone,ends);
          thread7660(tdone,ends);
          int biggest7661 = 0;
          if(ends[2]>=biggest7661){
            biggest7661=ends[2];
          }
          if(ends[7]>=biggest7661){
            biggest7661=ends[7];
          }
          if(ends[14]>=biggest7661){
            biggest7661=ends[14];
          }
          if(biggest7661 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          thread7662(tdone,ends);
          thread7673(tdone,ends);
          thread7710(tdone,ends);
          int biggest7711 = 0;
          if(ends[2]>=biggest7711){
            biggest7711=ends[2];
          }
          if(ends[7]>=biggest7711){
            biggest7711=ends[7];
          }
          if(ends[14]>=biggest7711){
            biggest7711=ends[14];
          }
          if(biggest7711 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest7711 == 0){
            S7656=0;
            active[1]=0;
            ends[1]=0;
            S7656=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      jobDoneM.setpreclear();
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
      jobDoneM.sethook();
      jobDoneM.setClear();
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
