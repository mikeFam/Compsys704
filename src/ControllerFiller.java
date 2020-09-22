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
  private int S7704 = 1;
  private int S4829 = 1;
  private int S4623 = 1;
  private int S4564 = 1;
  private int S4558 = 1;
  private int S4572 = 1;
  private int S4580 = 1;
  private int S4588 = 1;
  private int S7687 = 1;
  private int S5305 = 1;
  private int S5066 = 1;
  private int S4887 = 1;
  private int S4836 = 1;
  private int S4841 = 1;
  private int S4847 = 1;
  private int S4852 = 1;
  private int S4892 = 1;
  private int S4897 = 1;
  private int S7702 = 1;
  private int S7701 = 1;
  
  private int[] ends = new int[15];
  private int[] tdone = new int[15];
  
  public void thread7758(int [] tdone, int [] ends){
        switch(S7702){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S7701){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerFiller.sysj line: 55, column: 9
              S7701=1;
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

  public void thread7756(int [] tdone, int [] ends){
        switch(S4897){
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

  public void thread7755(int [] tdone, int [] ends){
        switch(S4892){
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

  public void thread7753(int [] tdone, int [] ends){
        S4897=1;
    jobDoneM.setPresent();//sysj\controllerFiller.sysj line: 48, column: 7
    currsigs.addElement(jobDoneM);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread7752(int [] tdone, int [] ends){
        S4892=1;
    jobDone.setPresent();//sysj\controllerFiller.sysj line: 46, column: 7
    currsigs.addElement(jobDone);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread7750(int [] tdone, int [] ends){
        switch(S4852){
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

  public void thread7749(int [] tdone, int [] ends){
        switch(S4847){
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

  public void thread7747(int [] tdone, int [] ends){
        S4897=1;
    jobDoneM.setPresent();//sysj\controllerFiller.sysj line: 48, column: 7
    currsigs.addElement(jobDoneM);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread7746(int [] tdone, int [] ends){
        S4892=1;
    jobDone.setPresent();//sysj\controllerFiller.sysj line: 46, column: 7
    currsigs.addElement(jobDone);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread7744(int [] tdone, int [] ends){
        S4852=1;
    valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 44, column: 7
    currsigs.addElement(valveInletOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread7743(int [] tdone, int [] ends){
        S4847=1;
    dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 41, column: 7
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread7741(int [] tdone, int [] ends){
        S4897=1;
    jobDoneM.setPresent();//sysj\controllerFiller.sysj line: 48, column: 7
    currsigs.addElement(jobDoneM);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread7740(int [] tdone, int [] ends){
        S4892=1;
    jobDone.setPresent();//sysj\controllerFiller.sysj line: 46, column: 7
    currsigs.addElement(jobDone);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread7738(int [] tdone, int [] ends){
        switch(S4841){
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

  public void thread7737(int [] tdone, int [] ends){
        switch(S4836){
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

  public void thread7735(int [] tdone, int [] ends){
        S4852=1;
    valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 44, column: 7
    currsigs.addElement(valveInletOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread7734(int [] tdone, int [] ends){
        S4847=1;
    dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 41, column: 7
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread7732(int [] tdone, int [] ends){
        S4897=1;
    jobDoneM.setPresent();//sysj\controllerFiller.sysj line: 48, column: 7
    currsigs.addElement(jobDoneM);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread7731(int [] tdone, int [] ends){
        S4892=1;
    jobDone.setPresent();//sysj\controllerFiller.sysj line: 46, column: 7
    currsigs.addElement(jobDone);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread7729(int [] tdone, int [] ends){
        S4841=1;
    valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 37, column: 7
    currsigs.addElement(valveInjectorOnOff);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread7728(int [] tdone, int [] ends){
        S4836=1;
    dosUnitValveRetract.setPresent();//sysj\controllerFiller.sysj line: 34, column: 7
    currsigs.addElement(dosUnitValveRetract);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread7726(int [] tdone, int [] ends){
        S4852=1;
    valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 44, column: 7
    currsigs.addElement(valveInletOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread7725(int [] tdone, int [] ends){
        S4847=1;
    dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 41, column: 7
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread7723(int [] tdone, int [] ends){
        S4897=1;
    jobDoneM.setPresent();//sysj\controllerFiller.sysj line: 48, column: 7
    currsigs.addElement(jobDoneM);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread7722(int [] tdone, int [] ends){
        S4892=1;
    jobDone.setPresent();//sysj\controllerFiller.sysj line: 46, column: 7
    currsigs.addElement(jobDone);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread7721(int [] tdone, int [] ends){
        switch(S7687){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S5305){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerFiller.sysj line: 28, column: 9
              S5305=1;
              S5066=0;
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
              S5305=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              switch(S5066){
                case 0 : 
                  if(bottleAtPos2.getprestatus()){//sysj\controllerFiller.sysj line: 30, column: 11
                    S5066=1;
                    if((!bottleAtPos2.getprestatus())){//sysj\controllerFiller.sysj line: 31, column: 21
                      S5305=0;
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    else {
                      S4887=0;
                      if((dosUnitFilled.getprestatus())){//sysj\controllerFiller.sysj line: 32, column: 22
                        S4887=1;
                        if((dosUnitEvac.getprestatus())){//sysj\controllerFiller.sysj line: 39, column: 22
                          S4887=2;
                          thread7722(tdone,ends);
                          thread7723(tdone,ends);
                          int biggest7724 = 0;
                          if(ends[12]>=biggest7724){
                            biggest7724=ends[12];
                          }
                          if(ends[13]>=biggest7724){
                            biggest7724=ends[13];
                          }
                          if(biggest7724 == 1){
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                        }
                        else {
                          thread7725(tdone,ends);
                          thread7726(tdone,ends);
                          int biggest7727 = 0;
                          if(ends[10]>=biggest7727){
                            biggest7727=ends[10];
                          }
                          if(ends[11]>=biggest7727){
                            biggest7727=ends[11];
                          }
                          if(biggest7727 == 1){
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                        }
                      }
                      else {
                        thread7728(tdone,ends);
                        thread7729(tdone,ends);
                        int biggest7730 = 0;
                        if(ends[8]>=biggest7730){
                          biggest7730=ends[8];
                        }
                        if(ends[9]>=biggest7730){
                          biggest7730=ends[9];
                        }
                        if(biggest7730 == 1){
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
                    S5305=0;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    switch(S4887){
                      case 0 : 
                        if((dosUnitFilled.getprestatus())){//sysj\controllerFiller.sysj line: 32, column: 22
                          S4887=1;
                          if((dosUnitEvac.getprestatus())){//sysj\controllerFiller.sysj line: 39, column: 22
                            S4887=2;
                            thread7731(tdone,ends);
                            thread7732(tdone,ends);
                            int biggest7733 = 0;
                            if(ends[12]>=biggest7733){
                              biggest7733=ends[12];
                            }
                            if(ends[13]>=biggest7733){
                              biggest7733=ends[13];
                            }
                            if(biggest7733 == 1){
                              active[7]=1;
                              ends[7]=1;
                              tdone[7]=1;
                            }
                          }
                          else {
                            thread7734(tdone,ends);
                            thread7735(tdone,ends);
                            int biggest7736 = 0;
                            if(ends[10]>=biggest7736){
                              biggest7736=ends[10];
                            }
                            if(ends[11]>=biggest7736){
                              biggest7736=ends[11];
                            }
                            if(biggest7736 == 1){
                              active[7]=1;
                              ends[7]=1;
                              tdone[7]=1;
                            }
                          }
                        }
                        else {
                          thread7737(tdone,ends);
                          thread7738(tdone,ends);
                          int biggest7739 = 0;
                          if(ends[8]>=biggest7739){
                            biggest7739=ends[8];
                          }
                          if(ends[9]>=biggest7739){
                            biggest7739=ends[9];
                          }
                          if(biggest7739 == 1){
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                          //FINXME code
                          if(biggest7739 == 0){
                            S4887=1;
                            if((dosUnitEvac.getprestatus())){//sysj\controllerFiller.sysj line: 39, column: 22
                              S4887=2;
                              thread7740(tdone,ends);
                              thread7741(tdone,ends);
                              int biggest7742 = 0;
                              if(ends[12]>=biggest7742){
                                biggest7742=ends[12];
                              }
                              if(ends[13]>=biggest7742){
                                biggest7742=ends[13];
                              }
                              if(biggest7742 == 1){
                                active[7]=1;
                                ends[7]=1;
                                tdone[7]=1;
                              }
                            }
                            else {
                              thread7743(tdone,ends);
                              thread7744(tdone,ends);
                              int biggest7745 = 0;
                              if(ends[10]>=biggest7745){
                                biggest7745=ends[10];
                              }
                              if(ends[11]>=biggest7745){
                                biggest7745=ends[11];
                              }
                              if(biggest7745 == 1){
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
                          S4887=2;
                          thread7746(tdone,ends);
                          thread7747(tdone,ends);
                          int biggest7748 = 0;
                          if(ends[12]>=biggest7748){
                            biggest7748=ends[12];
                          }
                          if(ends[13]>=biggest7748){
                            biggest7748=ends[13];
                          }
                          if(biggest7748 == 1){
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                        }
                        else {
                          thread7749(tdone,ends);
                          thread7750(tdone,ends);
                          int biggest7751 = 0;
                          if(ends[10]>=biggest7751){
                            biggest7751=ends[10];
                          }
                          if(ends[11]>=biggest7751){
                            biggest7751=ends[11];
                          }
                          if(biggest7751 == 1){
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                          //FINXME code
                          if(biggest7751 == 0){
                            S4887=2;
                            thread7752(tdone,ends);
                            thread7753(tdone,ends);
                            int biggest7754 = 0;
                            if(ends[12]>=biggest7754){
                              biggest7754=ends[12];
                            }
                            if(ends[13]>=biggest7754){
                              biggest7754=ends[13];
                            }
                            if(biggest7754 == 1){
                              active[7]=1;
                              ends[7]=1;
                              tdone[7]=1;
                            }
                          }
                        }
                        break;
                      
                      case 2 : 
                        thread7755(tdone,ends);
                        thread7756(tdone,ends);
                        int biggest7757 = 0;
                        if(ends[12]>=biggest7757){
                          biggest7757=ends[12];
                        }
                        if(ends[13]>=biggest7757){
                          biggest7757=ends[13];
                        }
                        if(biggest7757 == 1){
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                        //FINXME code
                        if(biggest7757 == 0){
                          S5305=0;
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

  public void thread7719(int [] tdone, int [] ends){
        switch(S4588){
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

  public void thread7718(int [] tdone, int [] ends){
        switch(S4580){
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

  public void thread7717(int [] tdone, int [] ends){
        switch(S4572){
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

  public void thread7716(int [] tdone, int [] ends){
        switch(S4564){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S4558){
          case 0 : 
            S4558=0;
            if(valveInjectorOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 15, column: 26
              valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 15, column: 47
              currsigs.addElement(valveInjectorOnOff);
              S4558=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S4558=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S4558=1;
            S4558=0;
            if(valveInjectorOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 15, column: 26
              valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 15, column: 47
              currsigs.addElement(valveInjectorOnOff);
              S4558=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S4558=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread7714(int [] tdone, int [] ends){
        S4588=1;
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

  public void thread7713(int [] tdone, int [] ends){
        S4580=1;
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

  public void thread7712(int [] tdone, int [] ends){
        S4572=1;
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

  public void thread7711(int [] tdone, int [] ends){
        S4564=1;
    S4558=0;
    if(valveInjectorOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 15, column: 26
      valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 15, column: 47
      currsigs.addElement(valveInjectorOnOff);
      S4558=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S4558=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread7710(int [] tdone, int [] ends){
        switch(S4829){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S4623){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerFiller.sysj line: 13, column: 10
              S4623=1;
              thread7711(tdone,ends);
              thread7712(tdone,ends);
              thread7713(tdone,ends);
              thread7714(tdone,ends);
              int biggest7715 = 0;
              if(ends[3]>=biggest7715){
                biggest7715=ends[3];
              }
              if(ends[4]>=biggest7715){
                biggest7715=ends[4];
              }
              if(ends[5]>=biggest7715){
                biggest7715=ends[5];
              }
              if(ends[6]>=biggest7715){
                biggest7715=ends[6];
              }
              if(biggest7715 == 1){
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
              S4623=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread7716(tdone,ends);
              thread7717(tdone,ends);
              thread7718(tdone,ends);
              thread7719(tdone,ends);
              int biggest7720 = 0;
              if(ends[3]>=biggest7720){
                biggest7720=ends[3];
              }
              if(ends[4]>=biggest7720){
                biggest7720=ends[4];
              }
              if(ends[5]>=biggest7720){
                biggest7720=ends[5];
              }
              if(ends[6]>=biggest7720){
                biggest7720=ends[6];
              }
              if(biggest7720 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest7720 == 0){
                S4623=0;
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

  public void thread7708(int [] tdone, int [] ends){
        S7702=1;
    S7701=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread7707(int [] tdone, int [] ends){
        S7687=1;
    S5305=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread7706(int [] tdone, int [] ends){
        S4829=1;
    S4623=0;
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
      switch(S7704){
        case 0 : 
          S7704=0;
          break RUN;
        
        case 1 : 
          S7704=2;
          S7704=2;
          selectM_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          thread7706(tdone,ends);
          thread7707(tdone,ends);
          thread7708(tdone,ends);
          int biggest7709 = 0;
          if(ends[2]>=biggest7709){
            biggest7709=ends[2];
          }
          if(ends[7]>=biggest7709){
            biggest7709=ends[7];
          }
          if(ends[14]>=biggest7709){
            biggest7709=ends[14];
          }
          if(biggest7709 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          thread7710(tdone,ends);
          thread7721(tdone,ends);
          thread7758(tdone,ends);
          int biggest7759 = 0;
          if(ends[2]>=biggest7759){
            biggest7759=ends[2];
          }
          if(ends[7]>=biggest7759){
            biggest7759=ends[7];
          }
          if(ends[14]>=biggest7759){
            biggest7759=ends[14];
          }
          if(biggest7759 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest7759 == 0){
            S7704=0;
            active[1]=0;
            ends[1]=0;
            S7704=0;
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
