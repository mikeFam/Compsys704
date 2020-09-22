import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ControllerMain extends ClockDomain{
  public ControllerMain(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal jobDoneRotary = new Signal("jobDoneRotary", Signal.INPUT);
  public Signal jobFillerDone = new Signal("jobFillerDone", Signal.INPUT);
  public Signal jobCapperDone = new Signal("jobCapperDone", Signal.INPUT);
  public Signal jobCapLoaderDone = new Signal("jobCapLoaderDone", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal loadBotlle = new Signal("loadBotlle", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.INPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.INPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.INPUT);
  public Signal orderNumber = new Signal("orderNumber", Signal.INPUT);
  public Signal enableConveyor = new Signal("enableConveyor", Signal.OUTPUT);
  public Signal enableCapLoader = new Signal("enableCapLoader", Signal.OUTPUT);
  public Signal enableFiller = new Signal("enableFiller", Signal.OUTPUT);
  public Signal enableCapper = new Signal("enableCapper", Signal.OUTPUT);
  public Signal enableRotaryTable = new Signal("enableRotaryTable", Signal.OUTPUT);
  public Signal enableRotaryTableC = new Signal("enableRotaryTableC", Signal.OUTPUT);
  public Signal bottleNumber = new Signal("bottleNumber", Signal.OUTPUT);
  public Signal bottleNumber1 = new Signal("bottleNumber1", Signal.OUTPUT);
  private int S8745 = 1;
  private int S8325 = 1;
  private int S7806 = 1;
  private int S7805 = 1;
  private int S7765 = 1;
  private int S7770 = 1;
  private int S7853 = 1;
  private int S7852 = 1;
  private int S7812 = 1;
  private int S7817 = 1;
  private int S7900 = 1;
  private int S7899 = 1;
  private int S7859 = 1;
  private int S7864 = 1;
  private int S7947 = 1;
  private int S7946 = 1;
  private int S7906 = 1;
  private int S7911 = 1;
  private int S8447 = 1;
  private int S8355 = 1;
  private int S8334 = 1;
  private int S8339 = 1;
  private int S8521 = 1;
  private int S8465 = 1;
  private int S8595 = 1;
  private int S8539 = 1;
  private int S8669 = 1;
  private int S8613 = 1;
  private int S8743 = 1;
  private int S8687 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread8804(int [] tdone, int [] ends){
        switch(S8743){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S8687){
          case 0 : 
            if(bottleAtPos4.getprestatus() && jobDoneRotary.getprestatus()){//sysj\controllerMain.sysj line: 99, column: 10
              S8687=1;
              if((!bottleAtPos4.getprestatus())){//sysj\controllerMain.sysj line: 100, column: 20
                S8687=0;
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
              else {
                System.out.println("bottleAtPos4");//sysj\controllerMain.sysj line: 101, column: 5
                enableCapper.setPresent();//sysj\controllerMain.sysj line: 102, column: 5
                currsigs.addElement(enableCapper);
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
            }
            else {
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
          case 1 : 
            if((!bottleAtPos4.getprestatus())){//sysj\controllerMain.sysj line: 100, column: 20
              S8687=0;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              enableCapper.setPresent();//sysj\controllerMain.sysj line: 102, column: 5
              currsigs.addElement(enableCapper);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread8803(int [] tdone, int [] ends){
        switch(S8669){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S8613){
          case 0 : 
            if(bottleAtPos3.getprestatus() && jobDoneRotary.getprestatus()){//sysj\controllerMain.sysj line: 89, column: 10
              S8613=1;
              if((!bottleAtPos3.getprestatus())){//sysj\controllerMain.sysj line: 90, column: 20
                S8613=0;
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
              else {
                System.out.println("bottleAtPos3");//sysj\controllerMain.sysj line: 91, column: 5
                enableCapLoader.setPresent();//sysj\controllerMain.sysj line: 92, column: 5
                currsigs.addElement(enableCapLoader);
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
            }
            else {
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
          case 1 : 
            if((!bottleAtPos3.getprestatus())){//sysj\controllerMain.sysj line: 90, column: 20
              S8613=0;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              enableCapLoader.setPresent();//sysj\controllerMain.sysj line: 92, column: 5
              currsigs.addElement(enableCapLoader);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread8802(int [] tdone, int [] ends){
        switch(S8595){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S8539){
          case 0 : 
            if(bottleAtPos2.getprestatus() && jobDoneRotary.getprestatus()){//sysj\controllerMain.sysj line: 79, column: 10
              S8539=1;
              if((!bottleAtPos2.getprestatus())){//sysj\controllerMain.sysj line: 80, column: 20
                S8539=0;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                System.out.println("bottleAtPos2");//sysj\controllerMain.sysj line: 81, column: 5
                enableFiller.setPresent();//sysj\controllerMain.sysj line: 82, column: 5
                currsigs.addElement(enableFiller);
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
            else {
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 1 : 
            if((!bottleAtPos2.getprestatus())){//sysj\controllerMain.sysj line: 80, column: 20
              S8539=0;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              enableFiller.setPresent();//sysj\controllerMain.sysj line: 82, column: 5
              currsigs.addElement(enableFiller);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread8801(int [] tdone, int [] ends){
        switch(S8521){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S8465){
          case 0 : 
            if(loadBotlle.getprestatus()){//sysj\controllerMain.sysj line: 69, column: 10
              S8465=1;
              if((!loadBotlle.getprestatus())){//sysj\controllerMain.sysj line: 70, column: 20
                S8465=0;
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
              else {
                System.out.println("bottleAtLoad");//sysj\controllerMain.sysj line: 71, column: 5
                enableConveyor.setPresent();//sysj\controllerMain.sysj line: 72, column: 5
                currsigs.addElement(enableConveyor);
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
            }
            else {
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 1 : 
            if((!loadBotlle.getprestatus())){//sysj\controllerMain.sysj line: 70, column: 20
              S8465=0;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              enableConveyor.setPresent();//sysj\controllerMain.sysj line: 72, column: 5
              currsigs.addElement(enableConveyor);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread8799(int [] tdone, int [] ends){
        switch(S8339){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        bottleNumber1.setPresent();//sysj\controllerMain.sysj line: 62, column: 6
        currsigs.addElement(bottleNumber1);
        bottleNumber1.setValue((orderNumber.getpreval() == null ? null : ((Integer)orderNumber.getpreval())));//sysj\controllerMain.sysj line: 62, column: 6
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
        break;
      
    }
  }

  public void thread8798(int [] tdone, int [] ends){
        switch(S8334){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        bottleNumber.setPresent();//sysj\controllerMain.sysj line: 60, column: 5
        currsigs.addElement(bottleNumber);
        bottleNumber.setValue((orderNumber.getpreval() == null ? null : ((Integer)orderNumber.getpreval())));//sysj\controllerMain.sysj line: 60, column: 5
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
        break;
      
    }
  }

  public void thread8796(int [] tdone, int [] ends){
        S8339=1;
    bottleNumber1.setPresent();//sysj\controllerMain.sysj line: 62, column: 6
    currsigs.addElement(bottleNumber1);
    bottleNumber1.setValue((orderNumber.getpreval() == null ? null : ((Integer)orderNumber.getpreval())));//sysj\controllerMain.sysj line: 62, column: 6
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread8795(int [] tdone, int [] ends){
        S8334=1;
    System.out.println((orderNumber.getpreval() == null ? null : ((Integer)orderNumber.getpreval())));//sysj\controllerMain.sysj line: 59, column: 6
    bottleNumber.setPresent();//sysj\controllerMain.sysj line: 60, column: 5
    currsigs.addElement(bottleNumber);
    bottleNumber.setValue((orderNumber.getpreval() == null ? null : ((Integer)orderNumber.getpreval())));//sysj\controllerMain.sysj line: 60, column: 5
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread8794(int [] tdone, int [] ends){
        switch(S8447){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S8355){
          case 0 : 
            if(orderNumber.getprestatus()){//sysj\controllerMain.sysj line: 57, column: 10
              S8355=1;
              thread8795(tdone,ends);
              thread8796(tdone,ends);
              int biggest8797 = 0;
              if(ends[16]>=biggest8797){
                biggest8797=ends[16];
              }
              if(ends[17]>=biggest8797){
                biggest8797=ends[17];
              }
              if(biggest8797 == 1){
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            if(!orderNumber.getprestatus()){//sysj\controllerMain.sysj line: 58, column: 10
              S8355=0;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              thread8798(tdone,ends);
              thread8799(tdone,ends);
              int biggest8800 = 0;
              if(ends[16]>=biggest8800){
                biggest8800=ends[16];
              }
              if(ends[17]>=biggest8800){
                biggest8800=ends[17];
              }
              if(biggest8800 == 1){
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              //FINXME code
              if(biggest8800 == 0){
                S8355=0;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread8792(int [] tdone, int [] ends){
        S7947=1;
    S7946=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread8791(int [] tdone, int [] ends){
        S7900=1;
    S7899=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread8790(int [] tdone, int [] ends){
        S7853=1;
    S7852=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread8789(int [] tdone, int [] ends){
        S7806=1;
    S7805=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread8786(int [] tdone, int [] ends){
        switch(S7911){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        enableRotaryTableC.setPresent();//sysj\controllerMain.sysj line: 49, column: 7
        currsigs.addElement(enableRotaryTableC);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread8785(int [] tdone, int [] ends){
        switch(S7906){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        enableRotaryTable.setPresent();//sysj\controllerMain.sysj line: 47, column: 7
        currsigs.addElement(enableRotaryTable);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread8783(int [] tdone, int [] ends){
        S7911=1;
    enableRotaryTableC.setPresent();//sysj\controllerMain.sysj line: 49, column: 7
    currsigs.addElement(enableRotaryTableC);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread8782(int [] tdone, int [] ends){
        S7906=1;
    enableRotaryTable.setPresent();//sysj\controllerMain.sysj line: 47, column: 7
    currsigs.addElement(enableRotaryTable);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread8781(int [] tdone, int [] ends){
        switch(S7947){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S7946){
          case 0 : 
            if(bottleAtPos4.getprestatus() && jobCapperDone.getprestatus()){//sysj\controllerMain.sysj line: 44, column: 11
              S7946=1;
              if((!bottleAtPos4.getprestatus())){//sysj\controllerMain.sysj line: 45, column: 21
                S7947=0;
                active[12]=0;
                ends[12]=0;
                tdone[12]=1;
              }
              else {
                System.out.println("Hello4");//sysj\controllerMain.sysj line: 46, column: 6
                thread8782(tdone,ends);
                thread8783(tdone,ends);
                int biggest8784 = 0;
                if(ends[13]>=biggest8784){
                  biggest8784=ends[13];
                }
                if(ends[14]>=biggest8784){
                  biggest8784=ends[14];
                }
                if(biggest8784 == 1){
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
              }
            }
            else {
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            if((!bottleAtPos4.getprestatus())){//sysj\controllerMain.sysj line: 45, column: 21
              S7947=0;
              active[12]=0;
              ends[12]=0;
              tdone[12]=1;
            }
            else {
              thread8785(tdone,ends);
              thread8786(tdone,ends);
              int biggest8787 = 0;
              if(ends[13]>=biggest8787){
                biggest8787=ends[13];
              }
              if(ends[14]>=biggest8787){
                biggest8787=ends[14];
              }
              if(biggest8787 == 1){
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              //FINXME code
              if(biggest8787 == 0){
                S7947=0;
                active[12]=0;
                ends[12]=0;
                tdone[12]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread8779(int [] tdone, int [] ends){
        switch(S7864){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        enableRotaryTableC.setPresent();//sysj\controllerMain.sysj line: 39, column: 7
        currsigs.addElement(enableRotaryTableC);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread8778(int [] tdone, int [] ends){
        switch(S7859){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        enableRotaryTable.setPresent();//sysj\controllerMain.sysj line: 37, column: 7
        currsigs.addElement(enableRotaryTable);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread8776(int [] tdone, int [] ends){
        S7864=1;
    enableRotaryTableC.setPresent();//sysj\controllerMain.sysj line: 39, column: 7
    currsigs.addElement(enableRotaryTableC);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread8775(int [] tdone, int [] ends){
        S7859=1;
    enableRotaryTable.setPresent();//sysj\controllerMain.sysj line: 37, column: 7
    currsigs.addElement(enableRotaryTable);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread8774(int [] tdone, int [] ends){
        switch(S7900){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S7899){
          case 0 : 
            if(bottleAtPos3.getprestatus() && jobCapLoaderDone.getprestatus()){//sysj\controllerMain.sysj line: 34, column: 11
              S7899=1;
              if((!bottleAtPos3.getprestatus())){//sysj\controllerMain.sysj line: 35, column: 21
                S7900=0;
                active[9]=0;
                ends[9]=0;
                tdone[9]=1;
              }
              else {
                System.out.println("Hello3");//sysj\controllerMain.sysj line: 36, column: 6
                thread8775(tdone,ends);
                thread8776(tdone,ends);
                int biggest8777 = 0;
                if(ends[10]>=biggest8777){
                  biggest8777=ends[10];
                }
                if(ends[11]>=biggest8777){
                  biggest8777=ends[11];
                }
                if(biggest8777 == 1){
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
              }
            }
            else {
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            if((!bottleAtPos3.getprestatus())){//sysj\controllerMain.sysj line: 35, column: 21
              S7900=0;
              active[9]=0;
              ends[9]=0;
              tdone[9]=1;
            }
            else {
              thread8778(tdone,ends);
              thread8779(tdone,ends);
              int biggest8780 = 0;
              if(ends[10]>=biggest8780){
                biggest8780=ends[10];
              }
              if(ends[11]>=biggest8780){
                biggest8780=ends[11];
              }
              if(biggest8780 == 1){
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
              //FINXME code
              if(biggest8780 == 0){
                S7900=0;
                active[9]=0;
                ends[9]=0;
                tdone[9]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread8772(int [] tdone, int [] ends){
        switch(S7817){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        enableRotaryTableC.setPresent();//sysj\controllerMain.sysj line: 29, column: 7
        currsigs.addElement(enableRotaryTableC);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread8771(int [] tdone, int [] ends){
        switch(S7812){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        enableRotaryTable.setPresent();//sysj\controllerMain.sysj line: 27, column: 7
        currsigs.addElement(enableRotaryTable);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread8769(int [] tdone, int [] ends){
        S7817=1;
    enableRotaryTableC.setPresent();//sysj\controllerMain.sysj line: 29, column: 7
    currsigs.addElement(enableRotaryTableC);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread8768(int [] tdone, int [] ends){
        S7812=1;
    enableRotaryTable.setPresent();//sysj\controllerMain.sysj line: 27, column: 7
    currsigs.addElement(enableRotaryTable);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread8767(int [] tdone, int [] ends){
        switch(S7853){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S7852){
          case 0 : 
            if(bottleAtPos2.getprestatus() && jobFillerDone.getprestatus()){//sysj\controllerMain.sysj line: 24, column: 11
              S7852=1;
              if((!bottleAtPos2.getprestatus())){//sysj\controllerMain.sysj line: 25, column: 21
                S7853=0;
                active[6]=0;
                ends[6]=0;
                tdone[6]=1;
              }
              else {
                System.out.println("Hello2");//sysj\controllerMain.sysj line: 26, column: 6
                thread8768(tdone,ends);
                thread8769(tdone,ends);
                int biggest8770 = 0;
                if(ends[7]>=biggest8770){
                  biggest8770=ends[7];
                }
                if(ends[8]>=biggest8770){
                  biggest8770=ends[8];
                }
                if(biggest8770 == 1){
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
              }
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if((!bottleAtPos2.getprestatus())){//sysj\controllerMain.sysj line: 25, column: 21
              S7853=0;
              active[6]=0;
              ends[6]=0;
              tdone[6]=1;
            }
            else {
              thread8771(tdone,ends);
              thread8772(tdone,ends);
              int biggest8773 = 0;
              if(ends[7]>=biggest8773){
                biggest8773=ends[7];
              }
              if(ends[8]>=biggest8773){
                biggest8773=ends[8];
              }
              if(biggest8773 == 1){
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              //FINXME code
              if(biggest8773 == 0){
                S7853=0;
                active[6]=0;
                ends[6]=0;
                tdone[6]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread8765(int [] tdone, int [] ends){
        switch(S7770){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        enableRotaryTableC.setPresent();//sysj\controllerMain.sysj line: 19, column: 7
        currsigs.addElement(enableRotaryTableC);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread8764(int [] tdone, int [] ends){
        switch(S7765){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        enableRotaryTable.setPresent();//sysj\controllerMain.sysj line: 17, column: 7
        currsigs.addElement(enableRotaryTable);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread8762(int [] tdone, int [] ends){
        S7770=1;
    enableRotaryTableC.setPresent();//sysj\controllerMain.sysj line: 19, column: 7
    currsigs.addElement(enableRotaryTableC);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread8761(int [] tdone, int [] ends){
        S7765=1;
    enableRotaryTable.setPresent();//sysj\controllerMain.sysj line: 17, column: 7
    currsigs.addElement(enableRotaryTable);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread8760(int [] tdone, int [] ends){
        switch(S7806){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S7805){
          case 0 : 
            if(bottleAtPos1.getprestatus()){//sysj\controllerMain.sysj line: 14, column: 11
              S7805=1;
              if((!bottleAtPos1.getprestatus())){//sysj\controllerMain.sysj line: 15, column: 21
                S7806=0;
                active[3]=0;
                ends[3]=0;
                tdone[3]=1;
              }
              else {
                System.out.println("bottleAtPos1");//sysj\controllerMain.sysj line: 16, column: 6
                thread8761(tdone,ends);
                thread8762(tdone,ends);
                int biggest8763 = 0;
                if(ends[4]>=biggest8763){
                  biggest8763=ends[4];
                }
                if(ends[5]>=biggest8763){
                  biggest8763=ends[5];
                }
                if(biggest8763 == 1){
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if((!bottleAtPos1.getprestatus())){//sysj\controllerMain.sysj line: 15, column: 21
              S7806=0;
              active[3]=0;
              ends[3]=0;
              tdone[3]=1;
            }
            else {
              thread8764(tdone,ends);
              thread8765(tdone,ends);
              int biggest8766 = 0;
              if(ends[4]>=biggest8766){
                biggest8766=ends[4];
              }
              if(ends[5]>=biggest8766){
                biggest8766=ends[5];
              }
              if(biggest8766 == 1){
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              //FINXME code
              if(biggest8766 == 0){
                S7806=0;
                active[3]=0;
                ends[3]=0;
                tdone[3]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread8759(int [] tdone, int [] ends){
        switch(S8325){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread8760(tdone,ends);
        thread8767(tdone,ends);
        thread8774(tdone,ends);
        thread8781(tdone,ends);
        int biggest8788 = 0;
        if(ends[3]>=biggest8788){
          biggest8788=ends[3];
        }
        if(ends[6]>=biggest8788){
          biggest8788=ends[6];
        }
        if(ends[9]>=biggest8788){
          biggest8788=ends[9];
        }
        if(ends[12]>=biggest8788){
          biggest8788=ends[12];
        }
        if(biggest8788 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest8788 == 0){
          thread8789(tdone,ends);
          thread8790(tdone,ends);
          thread8791(tdone,ends);
          thread8792(tdone,ends);
          int biggest8793 = 0;
          if(ends[3]>=biggest8793){
            biggest8793=ends[3];
          }
          if(ends[6]>=biggest8793){
            biggest8793=ends[6];
          }
          if(ends[9]>=biggest8793){
            biggest8793=ends[9];
          }
          if(ends[12]>=biggest8793){
            biggest8793=ends[12];
          }
          if(biggest8793 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        break;
      
    }
  }

  public void thread8757(int [] tdone, int [] ends){
        S8743=1;
    S8687=0;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread8756(int [] tdone, int [] ends){
        S8669=1;
    S8613=0;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread8755(int [] tdone, int [] ends){
        S8595=1;
    S8539=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread8754(int [] tdone, int [] ends){
        S8521=1;
    S8465=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread8753(int [] tdone, int [] ends){
        S8447=1;
    S8355=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread8751(int [] tdone, int [] ends){
        S7947=1;
    S7946=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread8750(int [] tdone, int [] ends){
        S7900=1;
    S7899=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread8749(int [] tdone, int [] ends){
        S7853=1;
    S7852=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread8748(int [] tdone, int [] ends){
        S7806=1;
    S7805=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread8747(int [] tdone, int [] ends){
        S8325=1;
    thread8748(tdone,ends);
    thread8749(tdone,ends);
    thread8750(tdone,ends);
    thread8751(tdone,ends);
    int biggest8752 = 0;
    if(ends[3]>=biggest8752){
      biggest8752=ends[3];
    }
    if(ends[6]>=biggest8752){
      biggest8752=ends[6];
    }
    if(ends[9]>=biggest8752){
      biggest8752=ends[9];
    }
    if(ends[12]>=biggest8752){
      biggest8752=ends[12];
    }
    if(biggest8752 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S8745){
        case 0 : 
          S8745=0;
          break RUN;
        
        case 1 : 
          S8745=2;
          S8745=2;
          thread8747(tdone,ends);
          thread8753(tdone,ends);
          thread8754(tdone,ends);
          thread8755(tdone,ends);
          thread8756(tdone,ends);
          thread8757(tdone,ends);
          int biggest8758 = 0;
          if(ends[2]>=biggest8758){
            biggest8758=ends[2];
          }
          if(ends[15]>=biggest8758){
            biggest8758=ends[15];
          }
          if(ends[18]>=biggest8758){
            biggest8758=ends[18];
          }
          if(ends[19]>=biggest8758){
            biggest8758=ends[19];
          }
          if(ends[20]>=biggest8758){
            biggest8758=ends[20];
          }
          if(ends[21]>=biggest8758){
            biggest8758=ends[21];
          }
          if(biggest8758 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread8759(tdone,ends);
          thread8794(tdone,ends);
          thread8801(tdone,ends);
          thread8802(tdone,ends);
          thread8803(tdone,ends);
          thread8804(tdone,ends);
          int biggest8805 = 0;
          if(ends[2]>=biggest8805){
            biggest8805=ends[2];
          }
          if(ends[15]>=biggest8805){
            biggest8805=ends[15];
          }
          if(ends[18]>=biggest8805){
            biggest8805=ends[18];
          }
          if(ends[19]>=biggest8805){
            biggest8805=ends[19];
          }
          if(ends[20]>=biggest8805){
            biggest8805=ends[20];
          }
          if(ends[21]>=biggest8805){
            biggest8805=ends[21];
          }
          if(biggest8805 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest8805 == 0){
            S8745=0;
            active[1]=0;
            ends[1]=0;
            S8745=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
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
          jobDoneRotary.gethook();
          jobFillerDone.gethook();
          jobCapperDone.gethook();
          jobCapLoaderDone.gethook();
          enable.gethook();
          loadBotlle.gethook();
          bottleAtPos1.gethook();
          bottleAtPos2.gethook();
          bottleAtPos3.gethook();
          bottleAtPos4.gethook();
          bottleAtPos5.gethook();
          bottleLeftPos5.gethook();
          orderNumber.gethook();
          df = true;
        }
        runClockDomain();
      }
      jobDoneRotary.setpreclear();
      jobFillerDone.setpreclear();
      jobCapperDone.setpreclear();
      jobCapLoaderDone.setpreclear();
      enable.setpreclear();
      loadBotlle.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos2.setpreclear();
      bottleAtPos3.setpreclear();
      bottleAtPos4.setpreclear();
      bottleAtPos5.setpreclear();
      bottleLeftPos5.setpreclear();
      orderNumber.setpreclear();
      enableConveyor.setpreclear();
      enableCapLoader.setpreclear();
      enableFiller.setpreclear();
      enableCapper.setpreclear();
      enableRotaryTable.setpreclear();
      enableRotaryTableC.setpreclear();
      bottleNumber.setpreclear();
      bottleNumber1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = jobDoneRotary.getStatus() ? jobDoneRotary.setprepresent() : jobDoneRotary.setpreclear();
      jobDoneRotary.setpreval(jobDoneRotary.getValue());
      jobDoneRotary.setClear();
      dummyint = jobFillerDone.getStatus() ? jobFillerDone.setprepresent() : jobFillerDone.setpreclear();
      jobFillerDone.setpreval(jobFillerDone.getValue());
      jobFillerDone.setClear();
      dummyint = jobCapperDone.getStatus() ? jobCapperDone.setprepresent() : jobCapperDone.setpreclear();
      jobCapperDone.setpreval(jobCapperDone.getValue());
      jobCapperDone.setClear();
      dummyint = jobCapLoaderDone.getStatus() ? jobCapLoaderDone.setprepresent() : jobCapLoaderDone.setpreclear();
      jobCapLoaderDone.setpreval(jobCapLoaderDone.getValue());
      jobCapLoaderDone.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = loadBotlle.getStatus() ? loadBotlle.setprepresent() : loadBotlle.setpreclear();
      loadBotlle.setpreval(loadBotlle.getValue());
      loadBotlle.setClear();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = bottleAtPos2.getStatus() ? bottleAtPos2.setprepresent() : bottleAtPos2.setpreclear();
      bottleAtPos2.setpreval(bottleAtPos2.getValue());
      bottleAtPos2.setClear();
      dummyint = bottleAtPos3.getStatus() ? bottleAtPos3.setprepresent() : bottleAtPos3.setpreclear();
      bottleAtPos3.setpreval(bottleAtPos3.getValue());
      bottleAtPos3.setClear();
      dummyint = bottleAtPos4.getStatus() ? bottleAtPos4.setprepresent() : bottleAtPos4.setpreclear();
      bottleAtPos4.setpreval(bottleAtPos4.getValue());
      bottleAtPos4.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      dummyint = bottleLeftPos5.getStatus() ? bottleLeftPos5.setprepresent() : bottleLeftPos5.setpreclear();
      bottleLeftPos5.setpreval(bottleLeftPos5.getValue());
      bottleLeftPos5.setClear();
      dummyint = orderNumber.getStatus() ? orderNumber.setprepresent() : orderNumber.setpreclear();
      orderNumber.setpreval(orderNumber.getValue());
      orderNumber.setClear();
      enableConveyor.sethook();
      enableConveyor.setClear();
      enableCapLoader.sethook();
      enableCapLoader.setClear();
      enableFiller.sethook();
      enableFiller.setClear();
      enableCapper.sethook();
      enableCapper.setClear();
      enableRotaryTable.sethook();
      enableRotaryTable.setClear();
      enableRotaryTableC.sethook();
      enableRotaryTableC.setClear();
      bottleNumber.sethook();
      bottleNumber.setClear();
      bottleNumber1.sethook();
      bottleNumber1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        jobDoneRotary.gethook();
        jobFillerDone.gethook();
        jobCapperDone.gethook();
        jobCapLoaderDone.gethook();
        enable.gethook();
        loadBotlle.gethook();
        bottleAtPos1.gethook();
        bottleAtPos2.gethook();
        bottleAtPos3.gethook();
        bottleAtPos4.gethook();
        bottleAtPos5.gethook();
        bottleLeftPos5.gethook();
        orderNumber.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
