package io.kodular.supersugiman.SIMPELSP2020LANJUTAN;

import androidx.core.internal.view.SupportMenu;
import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.ActivityStarter;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Decoration;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.GoogleMap;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.ListPicker;
import com.google.appinventor.components.runtime.LocationSensor;
import com.google.appinventor.components.runtime.Network;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.SpaceView;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.TinyDB;
import com.google.appinventor.components.runtime.VerticalScrollArrangement;
import com.google.appinventor.components.runtime.Web;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import org.jose4j.jws.AlgorithmIdentifiers;
/* compiled from: SP2020_V.yail */
/* loaded from: classes.dex */
public class SP2020_V extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final SimpleSymbol Lit100;
    static final FString Lit101;
    static final SimpleSymbol Lit102;
    static final PairWithPosition Lit103;
    static final SimpleSymbol Lit104;
    static final SimpleSymbol Lit105;
    static final FString Lit106;
    static final IntNum Lit107;
    static final FString Lit108;
    static final FString Lit109;
    static final SimpleSymbol Lit11;
    static final SimpleSymbol Lit110;
    static final IntNum Lit111;
    static final FString Lit112;
    static final FString Lit113;
    static final SimpleSymbol Lit114;
    static final SimpleSymbol Lit115;
    static final IntNum Lit116;
    static final FString Lit117;
    static final FString Lit118;
    static final SimpleSymbol Lit119;
    static final SimpleSymbol Lit12;
    static final IntNum Lit120;
    static final IntNum Lit121;
    static final FString Lit122;
    static final FString Lit123;
    static final SimpleSymbol Lit124;
    static final IntNum Lit125;
    static final FString Lit126;
    static final FString Lit127;
    static final SimpleSymbol Lit128;
    static final IntNum Lit129;
    static final SimpleSymbol Lit13;
    static final FString Lit130;
    static final FString Lit131;
    static final SimpleSymbol Lit132;
    static final IntNum Lit133;
    static final FString Lit134;
    static final FString Lit135;
    static final IntNum Lit136;
    static final FString Lit137;
    static final FString Lit138;
    static final SimpleSymbol Lit139;
    static final SimpleSymbol Lit14;
    static final IntNum Lit140;
    static final FString Lit141;
    static final FString Lit142;
    static final SimpleSymbol Lit143;
    static final IntNum Lit144;
    static final FString Lit145;
    static final FString Lit146;
    static final SimpleSymbol Lit147;
    static final IntNum Lit148;
    static final FString Lit149;
    static final SimpleSymbol Lit15;
    static final FString Lit150;
    static final IntNum Lit151;
    static final FString Lit152;
    static final FString Lit153;
    static final SimpleSymbol Lit154;
    static final IntNum Lit155;
    static final FString Lit156;
    static final FString Lit157;
    static final SimpleSymbol Lit158;
    static final IntNum Lit159;
    static final SimpleSymbol Lit16;
    static final FString Lit160;
    static final FString Lit161;
    static final SimpleSymbol Lit162;
    static final IntNum Lit163;
    static final FString Lit164;
    static final FString Lit165;
    static final SimpleSymbol Lit166;
    static final IntNum Lit167;
    static final FString Lit168;
    static final FString Lit169;
    static final SimpleSymbol Lit17;
    static final SimpleSymbol Lit170;
    static final FString Lit171;
    static final FString Lit172;
    static final SimpleSymbol Lit173;
    static final IntNum Lit174;
    static final FString Lit175;
    static final PairWithPosition Lit176;
    static final SimpleSymbol Lit177;
    static final SimpleSymbol Lit178;
    static final PairWithPosition Lit179;
    static final SimpleSymbol Lit18;
    static final PairWithPosition Lit180;
    static final PairWithPosition Lit181;
    static final PairWithPosition Lit182;
    static final PairWithPosition Lit183;
    static final PairWithPosition Lit184;
    static final PairWithPosition Lit185;
    static final PairWithPosition Lit186;
    static final IntNum Lit187;
    static final PairWithPosition Lit188;
    static final PairWithPosition Lit189;
    static final IntNum Lit19;
    static final PairWithPosition Lit190;
    static final PairWithPosition Lit191;
    static final PairWithPosition Lit192;
    static final PairWithPosition Lit193;
    static final PairWithPosition Lit194;
    static final PairWithPosition Lit195;
    static final PairWithPosition Lit196;
    static final PairWithPosition Lit197;
    static final SimpleSymbol Lit198;
    static final PairWithPosition Lit199;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final SimpleSymbol Lit200;
    static final SimpleSymbol Lit201;
    static final SimpleSymbol Lit202;
    static final PairWithPosition Lit203;
    static final SimpleSymbol Lit204;
    static final SimpleSymbol Lit205;
    static final PairWithPosition Lit206;
    static final SimpleSymbol Lit207;
    static final PairWithPosition Lit208;
    static final PairWithPosition Lit209;
    static final SimpleSymbol Lit21;
    static final PairWithPosition Lit210;
    static final PairWithPosition Lit211;
    static final SimpleSymbol Lit212;
    static final SimpleSymbol Lit213;
    static final PairWithPosition Lit214;
    static final SimpleSymbol Lit215;
    static final PairWithPosition Lit216;
    static final PairWithPosition Lit217;
    static final PairWithPosition Lit218;
    static final SimpleSymbol Lit219;
    static final IntNum Lit22;
    static final SimpleSymbol Lit220;
    static final SimpleSymbol Lit221;
    static final FString Lit222;
    static final SimpleSymbol Lit223;
    static final FString Lit224;
    static final FString Lit225;
    static final SimpleSymbol Lit226;
    static final IntNum Lit227;
    static final FString Lit228;
    static final PairWithPosition Lit229;
    static final SimpleSymbol Lit23;
    static final PairWithPosition Lit230;
    static final PairWithPosition Lit231;
    static final PairWithPosition Lit232;
    static final PairWithPosition Lit233;
    static final PairWithPosition Lit234;
    static final PairWithPosition Lit235;
    static final PairWithPosition Lit236;
    static final PairWithPosition Lit237;
    static final PairWithPosition Lit238;
    static final PairWithPosition Lit239;
    static final SimpleSymbol Lit24;
    static final PairWithPosition Lit240;
    static final PairWithPosition Lit241;
    static final PairWithPosition Lit242;
    static final PairWithPosition Lit243;
    static final PairWithPosition Lit244;
    static final PairWithPosition Lit245;
    static final PairWithPosition Lit246;
    static final PairWithPosition Lit247;
    static final SimpleSymbol Lit248;
    static final PairWithPosition Lit249;
    static final SimpleSymbol Lit25;
    static final SimpleSymbol Lit250;
    static final FString Lit251;
    static final SimpleSymbol Lit252;
    static final FString Lit253;
    static final FString Lit254;
    static final SimpleSymbol Lit255;
    static final IntNum Lit256;
    static final FString Lit257;
    static final PairWithPosition Lit258;
    static final SimpleSymbol Lit259;
    static final SimpleSymbol Lit26;
    static final FString Lit260;
    static final SimpleSymbol Lit261;
    static final IntNum Lit262;
    static final FString Lit263;
    static final FString Lit264;
    static final FString Lit265;
    static final FString Lit266;
    static final FString Lit267;
    static final FString Lit268;
    static final FString Lit269;
    static final SimpleSymbol Lit27;
    static final SimpleSymbol Lit270;
    static final PairWithPosition Lit271;
    static final PairWithPosition Lit272;
    static final PairWithPosition Lit273;
    static final PairWithPosition Lit274;
    static final PairWithPosition Lit275;
    static final SimpleSymbol Lit276;
    static final SimpleSymbol Lit277;
    static final FString Lit278;
    static final SimpleSymbol Lit279;
    static final SimpleSymbol Lit28;
    static final FString Lit280;
    static final FString Lit281;
    static final FString Lit282;
    static final SimpleSymbol Lit283;
    static final IntNum Lit284;
    static final PairWithPosition Lit285;
    static final SimpleSymbol Lit286;
    static final SimpleSymbol Lit287;
    static final PairWithPosition Lit288;
    static final SimpleSymbol Lit289;
    static final SimpleSymbol Lit29;
    static final PairWithPosition Lit290;
    static final PairWithPosition Lit291;
    static final SimpleSymbol Lit292;
    static final SimpleSymbol Lit293;
    static final FString Lit294;
    static final SimpleSymbol Lit295;
    static final FString Lit296;
    static final SimpleSymbol Lit297;
    static final SimpleSymbol Lit298;
    static final PairWithPosition Lit299;
    static final SimpleSymbol Lit3;
    static final IntNum Lit30;
    static final SimpleSymbol Lit300;
    static final SimpleSymbol Lit301;
    static final SimpleSymbol Lit302;
    static final SimpleSymbol Lit303;
    static final PairWithPosition Lit304;
    static final SimpleSymbol Lit305;
    static final PairWithPosition Lit306;
    static final PairWithPosition Lit307;
    static final IntNum Lit31;
    static final PairWithPosition Lit32;
    static final IntNum Lit33;
    static final PairWithPosition Lit34;
    static final IntNum Lit35;
    static final PairWithPosition Lit36;
    static final IntNum Lit37;
    static final PairWithPosition Lit38;
    static final IntNum Lit39;
    static final SimpleSymbol Lit4;
    static final PairWithPosition Lit40;
    static final IntNum Lit41;
    static final PairWithPosition Lit42;
    static final IntNum Lit43;
    static final PairWithPosition Lit44;
    static final IntNum Lit45;
    static final PairWithPosition Lit46;
    static final IntNum Lit47;
    static final PairWithPosition Lit48;
    static final PairWithPosition Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final IntNum Lit51;
    static final PairWithPosition Lit52;
    static final SimpleSymbol Lit53;
    static final SimpleSymbol Lit54;
    static final FString Lit55;
    static final SimpleSymbol Lit56;
    static final SimpleSymbol Lit57;
    static final IntNum Lit58;
    static final FString Lit59;
    static final SimpleSymbol Lit6;
    static final FString Lit60;
    static final SimpleSymbol Lit61;
    static final SimpleSymbol Lit62;
    static final IntNum Lit63;
    static final IntNum Lit64;
    static final SimpleSymbol Lit65;
    static final FString Lit66;
    static final FString Lit67;
    static final SimpleSymbol Lit68;
    static final SimpleSymbol Lit69;
    static final SimpleSymbol Lit7;
    static final SimpleSymbol Lit70;
    static final FString Lit71;
    static final FString Lit72;
    static final SimpleSymbol Lit73;
    static final SimpleSymbol Lit74;
    static final IntNum Lit75;
    static final IntNum Lit76;
    static final FString Lit77;
    static final FString Lit78;
    static final SimpleSymbol Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80;
    static final IntNum Lit81;
    static final IntNum Lit82;
    static final FString Lit83;
    static final FString Lit84;
    static final IntNum Lit85;
    static final SimpleSymbol Lit86;
    static final FString Lit87;
    static final FString Lit88;
    static final IntNum Lit89;
    static final SimpleSymbol Lit9;
    static final FString Lit90;
    static final FString Lit91;
    static final SimpleSymbol Lit92;
    static final IntNum Lit93;
    static final FString Lit94;
    static final FString Lit95;
    static final SimpleSymbol Lit96;
    static final SimpleSymbol Lit97;
    static final IntNum Lit98;
    static final SimpleSymbol Lit99;
    public static SP2020_V SP2020_V;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn40 = null;
    static final ModuleMethod lambda$Fn41 = null;
    static final ModuleMethod lambda$Fn42 = null;
    static final ModuleMethod lambda$Fn43 = null;
    static final ModuleMethod lambda$Fn44 = null;
    static final ModuleMethod lambda$Fn45 = null;
    static final ModuleMethod lambda$Fn46 = null;
    static final ModuleMethod lambda$Fn47 = null;
    static final ModuleMethod lambda$Fn48 = null;
    static final ModuleMethod lambda$Fn49 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn50 = null;
    static final ModuleMethod lambda$Fn51 = null;
    static final ModuleMethod lambda$Fn52 = null;
    static final ModuleMethod lambda$Fn53 = null;
    static final ModuleMethod lambda$Fn54 = null;
    static final ModuleMethod lambda$Fn55 = null;
    static final ModuleMethod lambda$Fn56 = null;
    static final ModuleMethod lambda$Fn57 = null;
    static final ModuleMethod lambda$Fn58 = null;
    static final ModuleMethod lambda$Fn59 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn60 = null;
    static final ModuleMethod lambda$Fn61 = null;
    static final ModuleMethod lambda$Fn62 = null;
    static final ModuleMethod lambda$Fn63 = null;
    static final ModuleMethod lambda$Fn64 = null;
    static final ModuleMethod lambda$Fn65 = null;
    static final ModuleMethod lambda$Fn66 = null;
    static final ModuleMethod lambda$Fn67 = null;
    static final ModuleMethod lambda$Fn68 = null;
    static final ModuleMethod lambda$Fn69 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn70 = null;
    static final ModuleMethod lambda$Fn71 = null;
    static final ModuleMethod lambda$Fn72 = null;
    static final ModuleMethod lambda$Fn73 = null;
    static final ModuleMethod lambda$Fn74 = null;
    static final ModuleMethod lambda$Fn75 = null;
    static final ModuleMethod lambda$Fn76 = null;
    static final ModuleMethod lambda$Fn77 = null;
    static final ModuleMethod lambda$Fn78 = null;
    static final ModuleMethod lambda$Fn79 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn80 = null;
    static final ModuleMethod lambda$Fn81 = null;
    static final ModuleMethod lambda$Fn82 = null;
    static final ModuleMethod lambda$Fn9 = null;
    static final ModuleMethod proc$Fn83 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public ActivityStarter Activity_Starter1;
    public Button ButtonKembali;
    public final ModuleMethod ButtonKembali$Click;
    public Button ButtonKirim;
    public final ModuleMethod ButtonKirim$Click;
    public Button ButtonSimpan;
    public final ModuleMethod ButtonSimpan$Click;
    public Clock Clock1;
    public Decoration Decoration1;
    public GoogleMap Google_Maps1;
    public HorizontalArrangement Horizontal_Arrangement1;
    public Label Label1;
    public Label Label1_copy;
    public Label Label1_copy_copy;
    public Label Label2;
    public ListPicker List_PickerNUS;
    public final ModuleMethod List_PickerNUS$AfterPicking;
    public LocationSensor Location_Sensor1;
    public final ModuleMethod Location_Sensor1$LocationChanged;
    public Network Network1;
    public Notifier Notifier1;
    public final ModuleMethod Notifier1$AfterChoosing;
    public final ModuleMethod SP2020_V$Initialize;
    public SpaceView Space1;
    public SpaceView Space1_copy;
    public SpaceView Space1_copy_copy;
    public SpaceView Space1_copy_copy1;
    public SpaceView Space1_copy_copy_copy;
    public SpaceView Space1_copy_copy_copy1;
    public SpaceView Space1_copy_copy_copy1_copy;
    public SpaceView Space1_copy_copy_copy1_copy1;
    public SpaceView Space1_copy_copy_copy_copy;
    public SpaceView Space1_copy_copy_copy_copy_copy;
    public SpaceView Space2;
    public TextBox Text_Box1503;
    public TextBox Text_Box1504;
    public TextBox Text_Box1505;
    public TextBox Text_BoxAlamat;
    public TextBox Text_BoxCatatan;
    public TextBox Text_BoxIDRUTA;
    public TextBox Text_BoxInfo;
    public TextBox Text_BoxLat;
    public TextBox Text_BoxLong;
    public TextBox Text_BoxNKS;
    public TextBox Text_BoxNUS;
    public TinyDB Tiny_DB8;
    public VerticalScrollArrangement Vertical_Scroll_Arrangement1;
    public Web Web1;
    public final ModuleMethod Web1$GotText;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;
    static final SimpleSymbol Lit335 = (SimpleSymbol) new SimpleSymbol("component").readResolve();
    static final SimpleSymbol Lit334 = (SimpleSymbol) new SimpleSymbol("any").readResolve();
    static final SimpleSymbol Lit333 = (SimpleSymbol) new SimpleSymbol("proc").readResolve();
    static final SimpleSymbol Lit332 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
    static final SimpleSymbol Lit331 = (SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve();
    static final SimpleSymbol Lit330 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
    static final SimpleSymbol Lit329 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
    static final SimpleSymbol Lit328 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
    static final SimpleSymbol Lit327 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
    static final SimpleSymbol Lit326 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
    static final SimpleSymbol Lit325 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
    static final SimpleSymbol Lit324 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
    static final SimpleSymbol Lit323 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
    static final SimpleSymbol Lit322 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
    static final SimpleSymbol Lit321 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
    static final SimpleSymbol Lit320 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
    static final SimpleSymbol Lit319 = (SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve();
    static final FString Lit318 = new FString("com.google.appinventor.components.runtime.Network");
    static final FString Lit317 = new FString("com.google.appinventor.components.runtime.Network");
    static final FString Lit316 = new FString("com.google.appinventor.components.runtime.Clock");
    static final SimpleSymbol Lit315 = (SimpleSymbol) new SimpleSymbol("Clock1").readResolve();
    static final FString Lit314 = new FString("com.google.appinventor.components.runtime.Clock");
    static final FString Lit313 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
    static final SimpleSymbol Lit312 = (SimpleSymbol) new SimpleSymbol("Activity_Starter1").readResolve();
    static final FString Lit311 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
    static final SimpleSymbol Lit310 = (SimpleSymbol) new SimpleSymbol("LocationChanged").readResolve();
    static final SimpleSymbol Lit309 = (SimpleSymbol) new SimpleSymbol("Location_Sensor1$LocationChanged").readResolve();
    static final SimpleSymbol Lit308 = (SimpleSymbol) new SimpleSymbol("CurrentAddress").readResolve();

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit7 = simpleSymbol;
        Lit307 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1782406);
        Lit306 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1782389), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1782384), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1782379), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1782374), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1782369), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1782364), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1782359), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1782354), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1782348);
        Lit305 = (SimpleSymbol) new SimpleSymbol("AddMarkersFromJson").readResolve();
        SimpleSymbol simpleSymbol2 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit20 = simpleSymbol2;
        Lit304 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1782118), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1782111), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1782103);
        Lit303 = (SimpleSymbol) new SimpleSymbol("$longitude").readResolve();
        Lit302 = (SimpleSymbol) new SimpleSymbol("$latitude").readResolve();
        Lit301 = (SimpleSymbol) new SimpleSymbol("MoveCamera").readResolve();
        Lit300 = (SimpleSymbol) new SimpleSymbol("GetAllMarkerID").readResolve();
        Lit299 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1781884);
        Lit298 = (SimpleSymbol) new SimpleSymbol("$item").readResolve();
        Lit297 = (SimpleSymbol) new SimpleSymbol("RemoveMarker").readResolve();
        Lit296 = new FString("com.google.appinventor.components.runtime.LocationSensor");
        Lit295 = (SimpleSymbol) new SimpleSymbol("Location_Sensor1").readResolve();
        Lit294 = new FString("com.google.appinventor.components.runtime.LocationSensor");
        Lit293 = (SimpleSymbol) new SimpleSymbol("GotText").readResolve();
        Lit292 = (SimpleSymbol) new SimpleSymbol("Web1$GotText").readResolve();
        Lit291 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1753867), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1753862), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1753856);
        Lit290 = PairWithPosition.make(Lit334, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1753678);
        Lit289 = (SimpleSymbol) new SimpleSymbol("DismissProgressDialog").readResolve();
        SimpleSymbol simpleSymbol3 = Lit7;
        SimpleSymbol simpleSymbol4 = Lit7;
        SimpleSymbol simpleSymbol5 = Lit7;
        SimpleSymbol simpleSymbol6 = Lit7;
        SimpleSymbol simpleSymbol7 = (SimpleSymbol) new SimpleSymbol("boolean").readResolve();
        Lit25 = simpleSymbol7;
        Lit288 = PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, PairWithPosition.make(simpleSymbol6, PairWithPosition.make(simpleSymbol7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1753484), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1753479), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1753474), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1753469), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1753463);
        Lit287 = (SimpleSymbol) new SimpleSymbol("HideKeyboard").readResolve();
        Lit286 = (SimpleSymbol) new SimpleSymbol("$responseContent").readResolve();
        Lit285 = PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1753191), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1753186);
        Lit284 = IntNum.make(200);
        Lit283 = (SimpleSymbol) new SimpleSymbol("$responseCode").readResolve();
        Lit282 = new FString("com.google.appinventor.components.runtime.Web");
        Lit281 = new FString("com.google.appinventor.components.runtime.Web");
        Lit280 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit279 = (SimpleSymbol) new SimpleSymbol("Namespace").readResolve();
        Lit278 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit277 = (SimpleSymbol) new SimpleSymbol("AfterChoosing").readResolve();
        Lit276 = (SimpleSymbol) new SimpleSymbol("Notifier1$AfterChoosing").readResolve();
        Lit275 = PairWithPosition.make(Lit334, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1696724);
        Lit274 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1696636), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1696631), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1696625);
        Lit273 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit334, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1696482), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1696476);
        Lit272 = PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1696453), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1696449), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1696445), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1696441), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1696437), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1696433), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1696429), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1696425), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1696421), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1696417), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1696412);
        Lit271 = PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1695842), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1695837);
        Lit270 = (SimpleSymbol) new SimpleSymbol("$choice").readResolve();
        Lit269 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit268 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit267 = new FString("com.google.appinventor.components.runtime.Decoration");
        Lit266 = new FString("com.google.appinventor.components.runtime.Decoration");
        Lit265 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit264 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit263 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit262 = IntNum.make(-1002);
        Lit261 = (SimpleSymbol) new SimpleSymbol("Space1_copy_copy_copy1_copy1").readResolve();
        Lit260 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit259 = (SimpleSymbol) new SimpleSymbol("ButtonKembali$Click").readResolve();
        Lit258 = PairWithPosition.make(Lit334, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1589335);
        Lit257 = new FString("com.google.appinventor.components.runtime.Button");
        Lit256 = IntNum.make(new int[]{-17625851});
        Lit255 = (SimpleSymbol) new SimpleSymbol("ButtonKembali").readResolve();
        Lit254 = new FString("com.google.appinventor.components.runtime.Button");
        Lit253 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit252 = (SimpleSymbol) new SimpleSymbol("Space1_copy_copy_copy_copy_copy").readResolve();
        Lit251 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit250 = (SimpleSymbol) new SimpleSymbol("ButtonSimpan$Click").readResolve();
        Lit249 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1502191), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1502186), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1502181), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1502176), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1502170);
        Lit248 = (SimpleSymbol) new SimpleSymbol("ShowChooseDialog").readResolve();
        Lit247 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1501930);
        Lit246 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1501727), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1501721);
        Lit245 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1501593), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1501588), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1501582);
        Lit244 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1501396), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1501388);
        Lit243 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1501281);
        Lit242 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1501158), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1501153), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1501147);
        Lit241 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1500966), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1500958);
        Lit240 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1500851);
        Lit239 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1500728), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1500723), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1500717);
        Lit238 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1500540), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1500532);
        Lit237 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1500424);
        Lit236 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1500301), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1500296), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1500290);
        Lit235 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1500107);
        Lit234 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1499997), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1499992), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1499986);
        Lit233 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1499816);
        Lit232 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1499705), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1499700), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1499694);
        Lit231 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1499524);
        Lit230 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1499414), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1499409), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1499403);
        Lit229 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1499236);
        Lit228 = new FString("com.google.appinventor.components.runtime.Button");
        Lit227 = IntNum.make(new int[]{-16294316});
        Lit226 = (SimpleSymbol) new SimpleSymbol("ButtonSimpan").readResolve();
        Lit225 = new FString("com.google.appinventor.components.runtime.Button");
        Lit224 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit223 = (SimpleSymbol) new SimpleSymbol("Space1_copy_copy_copy_copy").readResolve();
        Lit222 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit221 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit220 = (SimpleSymbol) new SimpleSymbol("ButtonKirim$Click").readResolve();
        Lit219 = (SimpleSymbol) new SimpleSymbol("Enabled").readResolve();
        Lit218 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1414718), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1414713), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1414707);
        Lit217 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit334, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1414533), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1414527);
        Lit216 = PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, PairWithPosition.make(Lit334, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1414504), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1414500), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1414496), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1414492), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1414488), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1414484), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1414480), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1414476), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1414472), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1414468), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1414463);
        Lit215 = (SimpleSymbol) new SimpleSymbol("StoreValue").readResolve();
        Lit214 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413905);
        Lit213 = (SimpleSymbol) new SimpleSymbol("ClearTag").readResolve();
        Lit212 = (SimpleSymbol) new SimpleSymbol("Tiny_DB8").readResolve();
        Lit211 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413751);
        Lit210 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413734), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413729), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413724), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413719), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413714), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413709), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413704), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413699), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413694), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413689), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413684), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413679), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413674), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413669), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413664), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413659), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413654), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413649), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413644), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413639), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413633);
        Lit209 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413615), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413610), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413605), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413599);
        Lit208 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413439), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413434), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413429), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1413423);
        Lit207 = (SimpleSymbol) new SimpleSymbol("PostText").readResolve();
        Lit206 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1412714), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1412708);
        Lit205 = (SimpleSymbol) new SimpleSymbol("Url").readResolve();
        Lit204 = (SimpleSymbol) new SimpleSymbol("Web1").readResolve();
        Lit203 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1412272), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1412266);
        Lit202 = (SimpleSymbol) new SimpleSymbol("ShowProgressDialog").readResolve();
        Lit201 = (SimpleSymbol) new SimpleSymbol("IsConnected").readResolve();
        Lit200 = (SimpleSymbol) new SimpleSymbol("Network1").readResolve();
        Lit199 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1411943);
        Lit198 = (SimpleSymbol) new SimpleSymbol("Text_BoxInfo").readResolve();
        Lit197 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1411832), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1411827), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1411821);
        Lit196 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1411623), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1411617);
        Lit195 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1411476), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1411471), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1411465);
        Lit194 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1411279), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1411271);
        Lit193 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1411164);
        Lit192 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1411041), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1411036), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1411030);
        Lit191 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1410854), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1410846);
        Lit190 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1410739);
        Lit189 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1410616), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1410611), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1410605);
        Lit188 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1410428), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1410420);
        Lit187 = IntNum.make(0);
        Lit186 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1410312);
        Lit185 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1410189), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1410184), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1410178);
        Lit184 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1409995);
        Lit183 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1409885), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1409880), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1409874);
        Lit182 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1409704);
        Lit181 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1409593), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1409588), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1409582);
        Lit180 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1409412);
        Lit179 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1409302), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1409297), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1409291);
        Lit178 = (SimpleSymbol) new SimpleSymbol("ShowMessageDialog").readResolve();
        Lit177 = (SimpleSymbol) new SimpleSymbol("Notifier1").readResolve();
        Lit176 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 1409124);
        Lit175 = new FString("com.google.appinventor.components.runtime.Button");
        Lit174 = IntNum.make(new int[]{-32885510});
        Lit173 = (SimpleSymbol) new SimpleSymbol("ButtonKirim").readResolve();
        Lit172 = new FString("com.google.appinventor.components.runtime.Button");
        Lit171 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit170 = (SimpleSymbol) new SimpleSymbol("Horizontal_Arrangement1").readResolve();
        Lit169 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit168 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit167 = IntNum.make(-1002);
        Lit166 = (SimpleSymbol) new SimpleSymbol("Space1_copy_copy_copy1").readResolve();
        Lit165 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit164 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit163 = IntNum.make(-1085);
        Lit162 = (SimpleSymbol) new SimpleSymbol("MultiLine").readResolve();
        Lit161 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit160 = new FString("com.google.appinventor.components.runtime.Label");
        Lit159 = IntNum.make(new int[]{-32885510});
        Lit158 = (SimpleSymbol) new SimpleSymbol("Label2").readResolve();
        Lit157 = new FString("com.google.appinventor.components.runtime.Label");
        Lit156 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit155 = IntNum.make(-1002);
        Lit154 = (SimpleSymbol) new SimpleSymbol("Space1_copy_copy_copy1_copy").readResolve();
        Lit153 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit152 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit151 = IntNum.make(-1025);
        Lit150 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit149 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit148 = IntNum.make(-1002);
        Lit147 = (SimpleSymbol) new SimpleSymbol("Space1_copy_copy_copy").readResolve();
        Lit146 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit145 = new FString("com.google.appinventor.components.runtime.Label");
        Lit144 = IntNum.make(new int[]{-32885510});
        Lit143 = (SimpleSymbol) new SimpleSymbol("Label1_copy_copy").readResolve();
        Lit142 = new FString("com.google.appinventor.components.runtime.Label");
        Lit141 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit140 = IntNum.make(-1002);
        Lit139 = (SimpleSymbol) new SimpleSymbol("Space1_copy_copy").readResolve();
        Lit138 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit137 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit136 = IntNum.make(-1025);
        Lit135 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit134 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit133 = IntNum.make(-1002);
        Lit132 = (SimpleSymbol) new SimpleSymbol("Space1_copy_copy1").readResolve();
        Lit131 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit130 = new FString("com.google.appinventor.components.runtime.Label");
        Lit129 = IntNum.make(new int[]{-32885510});
        Lit128 = (SimpleSymbol) new SimpleSymbol("Label1_copy").readResolve();
        Lit127 = new FString("com.google.appinventor.components.runtime.Label");
        Lit126 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit125 = IntNum.make(-1002);
        Lit124 = (SimpleSymbol) new SimpleSymbol("Space1_copy").readResolve();
        Lit123 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit122 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit121 = IntNum.make(-1025);
        Lit120 = IntNum.make(5);
        Lit119 = (SimpleSymbol) new SimpleSymbol("InputType").readResolve();
        Lit118 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit117 = new FString("com.google.appinventor.components.runtime.Label");
        Lit116 = IntNum.make(new int[]{-32885510});
        Lit115 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit114 = (SimpleSymbol) new SimpleSymbol("Label1").readResolve();
        Lit113 = new FString("com.google.appinventor.components.runtime.Label");
        Lit112 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit111 = IntNum.make(-1002);
        Lit110 = (SimpleSymbol) new SimpleSymbol("Space1").readResolve();
        Lit109 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit108 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit107 = IntNum.make(-1025);
        Lit106 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit105 = (SimpleSymbol) new SimpleSymbol("AfterPicking").readResolve();
        Lit104 = (SimpleSymbol) new SimpleSymbol("List_PickerNUS$AfterPicking").readResolve();
        Lit103 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 565579), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 565574), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 565568);
        Lit102 = (SimpleSymbol) new SimpleSymbol("$selection").readResolve();
        Lit101 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit100 = (SimpleSymbol) new SimpleSymbol("Shape").readResolve();
        Lit99 = (SimpleSymbol) new SimpleSymbol("ElementsFromString").readResolve();
        Lit98 = IntNum.make(new int[]{-32885510});
        Lit97 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit96 = (SimpleSymbol) new SimpleSymbol("List_PickerNUS").readResolve();
        Lit95 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit94 = new FString("com.google.appinventor.components.runtime.GoogleMap");
        Lit93 = IntNum.make(-1010);
        Lit92 = (SimpleSymbol) new SimpleSymbol("Google_Maps1").readResolve();
        Lit91 = new FString("com.google.appinventor.components.runtime.GoogleMap");
        Lit90 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit89 = IntNum.make(new int[]{-17625851});
        Lit88 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit87 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit86 = (SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve();
        Lit85 = IntNum.make(new int[]{-17625851});
        Lit84 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit83 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit82 = IntNum.make(-1085);
        Lit81 = IntNum.make(new int[]{-17625851});
        Lit80 = (SimpleSymbol) new SimpleSymbol("HintColor").readResolve();
        Lit79 = (SimpleSymbol) new SimpleSymbol("Hint").readResolve();
        Lit78 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit77 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit76 = IntNum.make(-1025);
        Lit75 = IntNum.make(15);
        Lit74 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit73 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        Lit72 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit71 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit70 = (SimpleSymbol) new SimpleSymbol("Visible").readResolve();
        Lit69 = (SimpleSymbol) new SimpleSymbol("ReadOnly").readResolve();
        Lit68 = (SimpleSymbol) new SimpleSymbol("Text_BoxIDRUTA").readResolve();
        Lit67 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit66 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
        Lit65 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit64 = IntNum.make(-2);
        Lit63 = IntNum.make(3);
        Lit62 = (SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve();
        Lit61 = (SimpleSymbol) new SimpleSymbol("Vertical_Scroll_Arrangement1").readResolve();
        Lit60 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
        Lit59 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit58 = IntNum.make(-1002);
        Lit57 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit56 = (SimpleSymbol) new SimpleSymbol("Space2").readResolve();
        Lit55 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit54 = (SimpleSymbol) new SimpleSymbol("Initialize").readResolve();
        Lit53 = (SimpleSymbol) new SimpleSymbol("SP2020_V$Initialize").readResolve();
        Lit52 = PairWithPosition.make((SimpleSymbol) new SimpleSymbol("list").readResolve(), PairWithPosition.make(Lit20, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95858), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95852);
        Lit51 = IntNum.make(1);
        Lit50 = (SimpleSymbol) new SimpleSymbol("$data").readResolve();
        Lit49 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95700), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95694);
        Lit48 = PairWithPosition.make(Lit335, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95529), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95522), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95515), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95504);
        Lit47 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit46 = PairWithPosition.make(Lit335, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95379), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95372), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95365), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95354);
        Lit45 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit44 = PairWithPosition.make(Lit335, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95232), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95225), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95218), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95207);
        Lit43 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit42 = PairWithPosition.make(Lit335, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95085), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95078), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95071), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 95060);
        Lit41 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit40 = PairWithPosition.make(Lit335, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94938), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94931), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94924), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94913);
        Lit39 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit38 = PairWithPosition.make(Lit335, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94792), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94785), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94778), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94767);
        Lit37 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit36 = PairWithPosition.make(Lit335, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94645), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94638), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94631), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94620);
        Lit35 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit34 = PairWithPosition.make(Lit335, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94499), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94492), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94485), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94474);
        Lit33 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit32 = PairWithPosition.make(Lit335, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94350), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94343), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94336), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/SP2020_V.yail", 94325);
        Lit31 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit30 = IntNum.make(-1);
        Lit29 = (SimpleSymbol) new SimpleSymbol("SetShape").readResolve();
        Lit28 = (SimpleSymbol) new SimpleSymbol("Decoration1").readResolve();
        Lit27 = (SimpleSymbol) new SimpleSymbol("TitleBarSubTitle").readResolve();
        Lit26 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit24 = (SimpleSymbol) new SimpleSymbol("Scrollable").readResolve();
        Lit23 = (SimpleSymbol) new SimpleSymbol("ReceiveSharedText").readResolve();
        Lit22 = IntNum.make(new int[]{-33408463});
        Lit21 = (SimpleSymbol) new SimpleSymbol("PrimaryColorDark").readResolve();
        Lit19 = IntNum.make(new int[]{-16294316});
        Lit18 = (SimpleSymbol) new SimpleSymbol("PrimaryColor").readResolve();
        Lit17 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit16 = (SimpleSymbol) new SimpleSymbol("AppId").readResolve();
        Lit15 = (SimpleSymbol) new SimpleSymbol("Text_BoxCatatan").readResolve();
        Lit14 = (SimpleSymbol) new SimpleSymbol("Text_Box1505").readResolve();
        Lit13 = (SimpleSymbol) new SimpleSymbol("Text_Box1504").readResolve();
        Lit12 = (SimpleSymbol) new SimpleSymbol("Text_Box1503").readResolve();
        Lit11 = (SimpleSymbol) new SimpleSymbol("Text_BoxNUS").readResolve();
        Lit10 = (SimpleSymbol) new SimpleSymbol("Text_BoxNKS").readResolve();
        Lit9 = (SimpleSymbol) new SimpleSymbol("Text_BoxLong").readResolve();
        Lit8 = (SimpleSymbol) new SimpleSymbol("Text_BoxLat").readResolve();
        Lit6 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit5 = (SimpleSymbol) new SimpleSymbol("Text_BoxAlamat").readResolve();
        Lit4 = (SimpleSymbol) new SimpleSymbol("p$bersih").readResolve();
        Lit3 = (SimpleSymbol) new SimpleSymbol("g$Respon").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("SP2020_V").readResolve();
    }

    public SP2020_V() {
        ModuleInfo.register(this);
        frame frameVar = new frame();
        frameVar.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frameVar, 1, Lit319, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frameVar, 2, Lit320, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frameVar, 3, Lit321, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frameVar, 4, Lit322, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frameVar, 6, Lit323, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frameVar, 7, Lit324, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frameVar, 8, Lit325, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frameVar, 9, Lit326, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frameVar, 10, Lit327, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frameVar, 11, Lit328, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frameVar, 12, Lit329, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frameVar, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frameVar, 14, Lit330, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frameVar, 15, Lit331, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frameVar, 16, Lit332, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frameVar, 17, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime4335152769950135233.scm:615");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frameVar, 18, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frameVar, 19, null, 0);
        lambda$Fn3 = new ModuleMethod(frameVar, 20, null, 0);
        lambda$Fn5 = new ModuleMethod(frameVar, 21, null, 0);
        lambda$Fn4 = new ModuleMethod(frameVar, 22, null, 0);
        lambda$Fn6 = new ModuleMethod(frameVar, 23, null, 0);
        this.SP2020_V$Initialize = new ModuleMethod(frameVar, 24, Lit53, 0);
        lambda$Fn7 = new ModuleMethod(frameVar, 25, null, 0);
        lambda$Fn8 = new ModuleMethod(frameVar, 26, null, 0);
        lambda$Fn9 = new ModuleMethod(frameVar, 27, null, 0);
        lambda$Fn10 = new ModuleMethod(frameVar, 28, null, 0);
        lambda$Fn11 = new ModuleMethod(frameVar, 29, null, 0);
        lambda$Fn12 = new ModuleMethod(frameVar, 30, null, 0);
        lambda$Fn13 = new ModuleMethod(frameVar, 31, null, 0);
        lambda$Fn14 = new ModuleMethod(frameVar, 32, null, 0);
        lambda$Fn15 = new ModuleMethod(frameVar, 33, null, 0);
        lambda$Fn16 = new ModuleMethod(frameVar, 34, null, 0);
        lambda$Fn17 = new ModuleMethod(frameVar, 35, null, 0);
        lambda$Fn18 = new ModuleMethod(frameVar, 36, null, 0);
        lambda$Fn19 = new ModuleMethod(frameVar, 37, null, 0);
        lambda$Fn20 = new ModuleMethod(frameVar, 38, null, 0);
        lambda$Fn21 = new ModuleMethod(frameVar, 39, null, 0);
        lambda$Fn22 = new ModuleMethod(frameVar, 40, null, 0);
        lambda$Fn23 = new ModuleMethod(frameVar, 41, null, 0);
        lambda$Fn24 = new ModuleMethod(frameVar, 42, null, 0);
        this.List_PickerNUS$AfterPicking = new ModuleMethod(frameVar, 43, Lit104, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn25 = new ModuleMethod(frameVar, 44, null, 0);
        lambda$Fn26 = new ModuleMethod(frameVar, 45, null, 0);
        lambda$Fn27 = new ModuleMethod(frameVar, 46, null, 0);
        lambda$Fn28 = new ModuleMethod(frameVar, 47, null, 0);
        lambda$Fn29 = new ModuleMethod(frameVar, 48, null, 0);
        lambda$Fn30 = new ModuleMethod(frameVar, 49, null, 0);
        lambda$Fn31 = new ModuleMethod(frameVar, 50, null, 0);
        lambda$Fn32 = new ModuleMethod(frameVar, 51, null, 0);
        lambda$Fn33 = new ModuleMethod(frameVar, 52, null, 0);
        lambda$Fn34 = new ModuleMethod(frameVar, 53, null, 0);
        lambda$Fn35 = new ModuleMethod(frameVar, 54, null, 0);
        lambda$Fn36 = new ModuleMethod(frameVar, 55, null, 0);
        lambda$Fn37 = new ModuleMethod(frameVar, 56, null, 0);
        lambda$Fn38 = new ModuleMethod(frameVar, 57, null, 0);
        lambda$Fn39 = new ModuleMethod(frameVar, 58, null, 0);
        lambda$Fn40 = new ModuleMethod(frameVar, 59, null, 0);
        lambda$Fn41 = new ModuleMethod(frameVar, 60, null, 0);
        lambda$Fn42 = new ModuleMethod(frameVar, 61, null, 0);
        lambda$Fn43 = new ModuleMethod(frameVar, 62, null, 0);
        lambda$Fn44 = new ModuleMethod(frameVar, 63, null, 0);
        lambda$Fn45 = new ModuleMethod(frameVar, 64, null, 0);
        lambda$Fn46 = new ModuleMethod(frameVar, 65, null, 0);
        lambda$Fn47 = new ModuleMethod(frameVar, 66, null, 0);
        lambda$Fn48 = new ModuleMethod(frameVar, 67, null, 0);
        lambda$Fn49 = new ModuleMethod(frameVar, 68, null, 0);
        lambda$Fn50 = new ModuleMethod(frameVar, 69, null, 0);
        lambda$Fn51 = new ModuleMethod(frameVar, 70, null, 0);
        lambda$Fn52 = new ModuleMethod(frameVar, 71, null, 0);
        lambda$Fn53 = new ModuleMethod(frameVar, 72, null, 0);
        lambda$Fn54 = new ModuleMethod(frameVar, 73, null, 0);
        lambda$Fn55 = new ModuleMethod(frameVar, 74, null, 0);
        lambda$Fn56 = new ModuleMethod(frameVar, 75, null, 0);
        lambda$Fn57 = new ModuleMethod(frameVar, 76, null, 0);
        lambda$Fn58 = new ModuleMethod(frameVar, 77, null, 0);
        lambda$Fn59 = new ModuleMethod(frameVar, 78, null, 0);
        lambda$Fn60 = new ModuleMethod(frameVar, 79, null, 0);
        lambda$Fn61 = new ModuleMethod(frameVar, 80, null, 0);
        lambda$Fn62 = new ModuleMethod(frameVar, 81, null, 0);
        lambda$Fn63 = new ModuleMethod(frameVar, 82, null, 0);
        lambda$Fn64 = new ModuleMethod(frameVar, 83, null, 0);
        lambda$Fn65 = new ModuleMethod(frameVar, 84, null, 0);
        lambda$Fn66 = new ModuleMethod(frameVar, 85, null, 0);
        this.ButtonKirim$Click = new ModuleMethod(frameVar, 86, Lit220, 0);
        lambda$Fn67 = new ModuleMethod(frameVar, 87, null, 0);
        lambda$Fn68 = new ModuleMethod(frameVar, 88, null, 0);
        lambda$Fn69 = new ModuleMethod(frameVar, 89, null, 0);
        lambda$Fn70 = new ModuleMethod(frameVar, 90, null, 0);
        lambda$Fn71 = new ModuleMethod(frameVar, 91, null, 0);
        lambda$Fn72 = new ModuleMethod(frameVar, 92, null, 0);
        lambda$Fn73 = new ModuleMethod(frameVar, 93, null, 0);
        lambda$Fn74 = new ModuleMethod(frameVar, 94, null, 0);
        this.ButtonSimpan$Click = new ModuleMethod(frameVar, 95, Lit250, 0);
        lambda$Fn75 = new ModuleMethod(frameVar, 96, null, 0);
        lambda$Fn76 = new ModuleMethod(frameVar, 97, null, 0);
        this.ButtonKembali$Click = new ModuleMethod(frameVar, 98, Lit259, 0);
        lambda$Fn77 = new ModuleMethod(frameVar, 99, null, 0);
        lambda$Fn78 = new ModuleMethod(frameVar, 100, null, 0);
        lambda$Fn79 = new ModuleMethod(frameVar, 101, null, 0);
        lambda$Fn80 = new ModuleMethod(frameVar, 102, null, 0);
        this.Notifier1$AfterChoosing = new ModuleMethod(frameVar, 103, Lit276, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn81 = new ModuleMethod(frameVar, 104, null, 0);
        lambda$Fn82 = new ModuleMethod(frameVar, 105, null, 0);
        this.Web1$GotText = new ModuleMethod(frameVar, 106, Lit292, 16388);
        proc$Fn83 = new ModuleMethod(frameVar, 107, Lit333, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Location_Sensor1$LocationChanged = new ModuleMethod(frameVar, 108, Lit309, 16388);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th;
        CallContext callContext = CallContext.getInstance();
        Consumer consumer = callContext.consumer;
        callContext.consumer = VoidConsumer.instance;
        try {
            run(callContext);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(callContext, th, consumer);
    }

    public final void run(CallContext $ctx) {
        Consumer $result = $ctx.consumer;
        runtime.$instance.run();
        this.$Stdebug$Mnform$St = Boolean.FALSE;
        this.form$Mnenvironment = Environment.make(Lit0.toString());
        FString stringAppend = strings.stringAppend(Lit0.toString(), "-global-vars");
        this.global$Mnvar$Mnenvironment = Environment.make(stringAppend == null ? null : stringAppend.toString());
        SP2020_V = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        runtime.$instance.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, ""), $result);
        } else {
            addToGlobalVars(Lit3, lambda$Fn2);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit4, lambda$Fn3), $result);
        } else {
            addToGlobalVars(Lit4, lambda$Fn4);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit16, "4734536543895552", Lit7);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit17, "SIMPELSP2020LANJUTAN", Lit7);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit18, Lit19, Lit20);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit21, Lit22, Lit20);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit23, AlgorithmIdentifiers.NONE, Lit7);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Boolean.TRUE, Lit25);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit26, "SIMPEL SP2020-V", Lit7);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit27, "SP2020-V", Lit7), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn6));
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit53, this.SP2020_V$Initialize);
        } else {
            addToFormEnvironment(Lit53, this.SP2020_V$Initialize);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "SP2020_V", "Initialize");
        } else {
            addToEvents(Lit0, Lit54);
        }
        this.Space2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit55, Lit56, lambda$Fn7), $result);
        } else {
            addToComponents(Lit0, Lit59, Lit56, lambda$Fn8);
        }
        this.Vertical_Scroll_Arrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit60, Lit61, lambda$Fn9), $result);
        } else {
            addToComponents(Lit0, Lit66, Lit61, lambda$Fn10);
        }
        this.Text_BoxIDRUTA = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit67, Lit68, lambda$Fn11), $result);
        } else {
            addToComponents(Lit61, Lit71, Lit68, lambda$Fn12);
        }
        this.Text_BoxNKS = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit72, Lit10, lambda$Fn13), $result);
        } else {
            addToComponents(Lit61, Lit77, Lit10, lambda$Fn14);
        }
        this.Text_BoxAlamat = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit78, Lit5, lambda$Fn15), $result);
        } else {
            addToComponents(Lit61, Lit83, Lit5, lambda$Fn16);
        }
        this.Text_BoxLat = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit84, Lit8, lambda$Fn17), $result);
        } else {
            addToComponents(Lit61, Lit87, Lit8, lambda$Fn18);
        }
        this.Text_BoxLong = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit88, Lit9, lambda$Fn19), $result);
        } else {
            addToComponents(Lit61, Lit90, Lit9, lambda$Fn20);
        }
        this.Google_Maps1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit91, Lit92, lambda$Fn21), $result);
        } else {
            addToComponents(Lit61, Lit94, Lit92, lambda$Fn22);
        }
        this.List_PickerNUS = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit95, Lit96, lambda$Fn23), $result);
        } else {
            addToComponents(Lit61, Lit101, Lit96, lambda$Fn24);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit104, this.List_PickerNUS$AfterPicking);
        } else {
            addToFormEnvironment(Lit104, this.List_PickerNUS$AfterPicking);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "List_PickerNUS", "AfterPicking");
        } else {
            addToEvents(Lit96, Lit105);
        }
        this.Text_BoxNUS = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit106, Lit11, lambda$Fn25), $result);
        } else {
            addToComponents(Lit61, Lit108, Lit11, lambda$Fn26);
        }
        this.Space1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit109, Lit110, lambda$Fn27), $result);
        } else {
            addToComponents(Lit61, Lit112, Lit110, lambda$Fn28);
        }
        this.Label1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit113, Lit114, lambda$Fn29), $result);
        } else {
            addToComponents(Lit61, Lit117, Lit114, lambda$Fn30);
        }
        this.Text_Box1503 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit118, Lit12, lambda$Fn31), $result);
        } else {
            addToComponents(Lit61, Lit122, Lit12, lambda$Fn32);
        }
        this.Space1_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit123, Lit124, lambda$Fn33), $result);
        } else {
            addToComponents(Lit61, Lit126, Lit124, lambda$Fn34);
        }
        this.Label1_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit127, Lit128, lambda$Fn35), $result);
        } else {
            addToComponents(Lit61, Lit130, Lit128, lambda$Fn36);
        }
        this.Space1_copy_copy1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit131, Lit132, lambda$Fn37), $result);
        } else {
            addToComponents(Lit61, Lit134, Lit132, lambda$Fn38);
        }
        this.Text_Box1504 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit135, Lit13, lambda$Fn39), $result);
        } else {
            addToComponents(Lit61, Lit137, Lit13, lambda$Fn40);
        }
        this.Space1_copy_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit138, Lit139, lambda$Fn41), $result);
        } else {
            addToComponents(Lit61, Lit141, Lit139, lambda$Fn42);
        }
        this.Label1_copy_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit142, Lit143, lambda$Fn43), $result);
        } else {
            addToComponents(Lit61, Lit145, Lit143, lambda$Fn44);
        }
        this.Space1_copy_copy_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit146, Lit147, lambda$Fn45), $result);
        } else {
            addToComponents(Lit61, Lit149, Lit147, lambda$Fn46);
        }
        this.Text_Box1505 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit150, Lit14, lambda$Fn47), $result);
        } else {
            addToComponents(Lit61, Lit152, Lit14, lambda$Fn48);
        }
        this.Space1_copy_copy_copy1_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit153, Lit154, lambda$Fn49), $result);
        } else {
            addToComponents(Lit61, Lit156, Lit154, lambda$Fn50);
        }
        this.Label2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit157, Lit158, lambda$Fn51), $result);
        } else {
            addToComponents(Lit61, Lit160, Lit158, lambda$Fn52);
        }
        this.Text_BoxCatatan = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit161, Lit15, lambda$Fn53), $result);
        } else {
            addToComponents(Lit61, Lit164, Lit15, lambda$Fn54);
        }
        this.Space1_copy_copy_copy1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit165, Lit166, lambda$Fn55), $result);
        } else {
            addToComponents(Lit61, Lit168, Lit166, lambda$Fn56);
        }
        this.Horizontal_Arrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit169, Lit170, lambda$Fn57), $result);
        } else {
            addToComponents(Lit61, Lit171, Lit170, lambda$Fn58);
        }
        this.ButtonKirim = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit170, Lit172, Lit173, lambda$Fn59), $result);
        } else {
            addToComponents(Lit170, Lit175, Lit173, lambda$Fn60);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit220, this.ButtonKirim$Click);
        } else {
            addToFormEnvironment(Lit220, this.ButtonKirim$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ButtonKirim", "Click");
        } else {
            addToEvents(Lit173, Lit221);
        }
        this.Space1_copy_copy_copy_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit170, Lit222, Lit223, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit170, Lit224, Lit223, Boolean.FALSE);
        }
        this.ButtonSimpan = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit170, Lit225, Lit226, lambda$Fn67), $result);
        } else {
            addToComponents(Lit170, Lit228, Lit226, lambda$Fn68);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit250, this.ButtonSimpan$Click);
        } else {
            addToFormEnvironment(Lit250, this.ButtonSimpan$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ButtonSimpan", "Click");
        } else {
            addToEvents(Lit226, Lit221);
        }
        this.Space1_copy_copy_copy_copy_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit170, Lit251, Lit252, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit170, Lit253, Lit252, Boolean.FALSE);
        }
        this.ButtonKembali = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit170, Lit254, Lit255, lambda$Fn75), $result);
        } else {
            addToComponents(Lit170, Lit257, Lit255, lambda$Fn76);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit259, this.ButtonKembali$Click);
        } else {
            addToFormEnvironment(Lit259, this.ButtonKembali$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ButtonKembali", "Click");
        } else {
            addToEvents(Lit255, Lit221);
        }
        this.Space1_copy_copy_copy1_copy1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit260, Lit261, lambda$Fn77), $result);
        } else {
            addToComponents(Lit0, Lit263, Lit261, lambda$Fn78);
        }
        this.Text_BoxInfo = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit264, Lit198, lambda$Fn79), $result);
        } else {
            addToComponents(Lit0, Lit265, Lit198, lambda$Fn80);
        }
        this.Decoration1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit266, Lit28, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit267, Lit28, Boolean.FALSE);
        }
        this.Notifier1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit268, Lit177, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit269, Lit177, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit276, this.Notifier1$AfterChoosing);
        } else {
            addToFormEnvironment(Lit276, this.Notifier1$AfterChoosing);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Notifier1", "AfterChoosing");
        } else {
            addToEvents(Lit177, Lit277);
        }
        this.Tiny_DB8 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit278, Lit212, lambda$Fn81), $result);
        } else {
            addToComponents(Lit0, Lit280, Lit212, lambda$Fn82);
        }
        this.Web1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit281, Lit204, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit282, Lit204, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit292, this.Web1$GotText);
        } else {
            addToFormEnvironment(Lit292, this.Web1$GotText);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Web1", "GotText");
        } else {
            addToEvents(Lit204, Lit293);
        }
        this.Location_Sensor1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit294, Lit295, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit296, Lit295, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit309, this.Location_Sensor1$LocationChanged);
        } else {
            addToFormEnvironment(Lit309, this.Location_Sensor1$LocationChanged);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Location_Sensor1", "LocationChanged");
        } else {
            addToEvents(Lit295, Lit310);
        }
        this.Activity_Starter1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit311, Lit312, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit313, Lit312, Boolean.FALSE);
        }
        this.Clock1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit314, Lit315, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit316, Lit315, Boolean.FALSE);
        }
        this.Network1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit317, Lit200, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit318, Lit200, Boolean.FALSE);
        }
        runtime.initRuntime();
    }

    /* compiled from: SP2020_V.yail */
    /* loaded from: classes.dex */
    public class frame extends ModuleBody {
        SP2020_V $main;

        @Override // gnu.expr.ModuleBody
        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 17:
                    return SP2020_V.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return SP2020_V.lambda3();
                case 20:
                    return SP2020_V.lambda4();
                case 21:
                    return SP2020_V.lambda6();
                case 22:
                    return SP2020_V.lambda5();
                case 23:
                    return SP2020_V.lambda7();
                case 24:
                    return this.$main.SP2020_V$Initialize();
                case 25:
                    return SP2020_V.lambda8();
                case 26:
                    return SP2020_V.lambda9();
                case 27:
                    return SP2020_V.lambda10();
                case 28:
                    return SP2020_V.lambda11();
                case 29:
                    return SP2020_V.lambda12();
                case 30:
                    return SP2020_V.lambda13();
                case 31:
                    return SP2020_V.lambda14();
                case 32:
                    return SP2020_V.lambda15();
                case 33:
                    return SP2020_V.lambda16();
                case 34:
                    return SP2020_V.lambda17();
                case 35:
                    return SP2020_V.lambda18();
                case 36:
                    return SP2020_V.lambda19();
                case 37:
                    return SP2020_V.lambda20();
                case 38:
                    return SP2020_V.lambda21();
                case 39:
                    return SP2020_V.lambda22();
                case 40:
                    return SP2020_V.lambda23();
                case 41:
                    return SP2020_V.lambda24();
                case 42:
                    return SP2020_V.lambda25();
                case 43:
                case 103:
                default:
                    return super.apply0(moduleMethod);
                case 44:
                    return SP2020_V.lambda26();
                case 45:
                    return SP2020_V.lambda27();
                case 46:
                    return SP2020_V.lambda28();
                case 47:
                    return SP2020_V.lambda29();
                case 48:
                    return SP2020_V.lambda30();
                case 49:
                    return SP2020_V.lambda31();
                case 50:
                    return SP2020_V.lambda32();
                case 51:
                    return SP2020_V.lambda33();
                case 52:
                    return SP2020_V.lambda34();
                case 53:
                    return SP2020_V.lambda35();
                case 54:
                    return SP2020_V.lambda36();
                case 55:
                    return SP2020_V.lambda37();
                case 56:
                    return SP2020_V.lambda38();
                case 57:
                    return SP2020_V.lambda39();
                case 58:
                    return SP2020_V.lambda40();
                case 59:
                    return SP2020_V.lambda41();
                case 60:
                    return SP2020_V.lambda42();
                case 61:
                    return SP2020_V.lambda43();
                case 62:
                    return SP2020_V.lambda44();
                case 63:
                    return SP2020_V.lambda45();
                case 64:
                    return SP2020_V.lambda46();
                case 65:
                    return SP2020_V.lambda47();
                case 66:
                    return SP2020_V.lambda48();
                case 67:
                    return SP2020_V.lambda49();
                case 68:
                    return SP2020_V.lambda50();
                case 69:
                    return SP2020_V.lambda51();
                case 70:
                    return SP2020_V.lambda52();
                case 71:
                    return SP2020_V.lambda53();
                case 72:
                    return SP2020_V.lambda54();
                case 73:
                    return SP2020_V.lambda55();
                case 74:
                    return SP2020_V.lambda56();
                case 75:
                    return SP2020_V.lambda57();
                case 76:
                    return SP2020_V.lambda58();
                case 77:
                    return SP2020_V.lambda59();
                case 78:
                    return SP2020_V.lambda60();
                case 79:
                    return SP2020_V.lambda61();
                case 80:
                    return SP2020_V.lambda62();
                case 81:
                    return SP2020_V.lambda63();
                case 82:
                    return SP2020_V.lambda64();
                case 83:
                    return SP2020_V.lambda65();
                case 84:
                    return SP2020_V.lambda66();
                case 85:
                    return SP2020_V.lambda67();
                case 86:
                    return this.$main.ButtonKirim$Click();
                case 87:
                    return SP2020_V.lambda68();
                case 88:
                    return SP2020_V.lambda69();
                case 89:
                    return SP2020_V.lambda70();
                case 90:
                    return SP2020_V.lambda71();
                case 91:
                    return SP2020_V.lambda72();
                case 92:
                    return SP2020_V.lambda73();
                case 93:
                    return SP2020_V.lambda74();
                case 94:
                    return SP2020_V.lambda75();
                case 95:
                    return this.$main.ButtonSimpan$Click();
                case 96:
                    return SP2020_V.lambda76();
                case 97:
                    return SP2020_V.lambda77();
                case 98:
                    return this.$main.ButtonKembali$Click();
                case 99:
                    return SP2020_V.lambda78();
                case 100:
                    return SP2020_V.lambda79();
                case 101:
                    return SP2020_V.lambda80();
                case 102:
                    return SP2020_V.lambda81();
                case 104:
                    return SP2020_V.lambda82();
                case 105:
                    return SP2020_V.lambda83();
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 17:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 42:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 43:
                case 103:
                default:
                    return super.match0(moduleMethod, callContext);
                case 44:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 45:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 46:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 47:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 48:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 54:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 55:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 56:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 57:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 58:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 59:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 60:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 61:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 62:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 63:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 64:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 65:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 66:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 67:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 68:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 69:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 70:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 71:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 72:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 73:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 74:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 75:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 76:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 77:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 78:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 79:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 80:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 81:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 82:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 83:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 84:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 85:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 86:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 87:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 88:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 89:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 90:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 91:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 92:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 93:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 94:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 95:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 96:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 97:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 98:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 99:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 100:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 101:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 102:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 104:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 105:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 2:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 4:
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.proc = moduleMethod;
                        callContext.pc = 1;
                        return 0;
                    }
                    return -786431;
                case 6:
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.proc = moduleMethod;
                        callContext.pc = 1;
                        return 0;
                    }
                    return -786431;
                case 11:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 12:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 13:
                    if (obj instanceof SP2020_V) {
                        callContext.value1 = obj;
                        callContext.proc = moduleMethod;
                        callContext.pc = 1;
                        return 0;
                    }
                    return -786431;
                case 43:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 103:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 107:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 3:
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.value2 = obj2;
                        callContext.proc = moduleMethod;
                        callContext.pc = 2;
                        return 0;
                    }
                    return -786431;
                case 4:
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.value2 = obj2;
                        callContext.proc = moduleMethod;
                        callContext.pc = 2;
                        return 0;
                    }
                    return -786431;
                case 5:
                case 6:
                case 9:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
                case 7:
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.value2 = obj2;
                        callContext.proc = moduleMethod;
                        callContext.pc = 2;
                        return 0;
                    }
                    return -786431;
                case 8:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 10:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 16:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 14:
                    if (obj instanceof SP2020_V) {
                        callContext.value1 = obj;
                        if (obj2 instanceof Component) {
                            callContext.value2 = obj2;
                            if (obj3 instanceof String) {
                                callContext.value3 = obj3;
                                if (obj4 instanceof String) {
                                    callContext.value4 = obj4;
                                    callContext.proc = moduleMethod;
                                    callContext.pc = 4;
                                    return 0;
                                }
                                return -786428;
                            }
                            return -786429;
                        }
                        return -786430;
                    }
                    return -786431;
                case 15:
                    if (obj instanceof SP2020_V) {
                        callContext.value1 = obj;
                        if (obj2 instanceof Component) {
                            callContext.value2 = obj2;
                            if (obj3 instanceof String) {
                                callContext.value3 = obj3;
                                if (1 != 0) {
                                    callContext.value4 = obj4;
                                    callContext.proc = moduleMethod;
                                    callContext.pc = 4;
                                    return 0;
                                }
                                return -786428;
                            }
                            return -786429;
                        }
                        return -786430;
                    }
                    return -786431;
                case 106:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 108:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    return this.$main.getSimpleName(obj);
                case 2:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "lookup-in-form-environment", 1, obj);
                    }
                case 6:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "is-bound-in-form-environment", 1, obj);
                    }
                case 11:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 12:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 13:
                    this.$main.processException(obj);
                    return Values.empty;
                case 43:
                    return this.$main.List_PickerNUS$AfterPicking(obj);
                case 103:
                    return this.$main.Notifier1$AfterChoosing(obj);
                case 107:
                    return SP2020_V.lambda84proc(obj);
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case 9:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 14:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e3) {
                            throw new WrongType(e3, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e4) {
                        throw new WrongType(e4, "dispatchEvent", 1, obj);
                    }
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    this.$main.dispatchGenericEvent((Component) obj, (String) obj2, obj3 != Boolean.FALSE, (Object[]) obj4);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    throw new WrongType(e5, "dispatchGenericEvent", 4, obj4);
                                }
                            } catch (ClassCastException e6) {
                                throw new WrongType(e6, "dispatchGenericEvent", 3, obj3);
                            }
                        } catch (ClassCastException e7) {
                            throw new WrongType(e7, "dispatchGenericEvent", 2, obj2);
                        }
                    } catch (ClassCastException e8) {
                        throw new WrongType(e8, "dispatchGenericEvent", 1, obj);
                    }
                case 106:
                    return this.$main.Web1$GotText(obj, obj2, obj3, obj4);
                case 108:
                    return this.$main.Location_Sensor1$LocationChanged(obj, obj2, obj3, obj4);
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 3:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 5:
                case 6:
                case 9:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                default:
                    return super.apply2(moduleMethod, obj, obj2);
                case 7:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "add-to-global-var-environment", 1, obj);
                    }
                case 8:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 10:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 16:
                    return this.$main.lookupHandler(obj, obj2);
            }
        }
    }

    static String lambda3() {
        return "";
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit5, Lit6, "", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit6, "", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit6, "", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit6, "", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit6, "", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit6, "", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit6, "", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit14, Lit6, "", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit15, Lit6, "", Lit7);
    }

    static Procedure lambda5() {
        return lambda$Fn5;
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit5, Lit6, "", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit6, "", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit6, "", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit6, "", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit6, "", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit6, "", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit6, "", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit14, Lit6, "", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit15, Lit6, "", Lit7);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit16, "4734536543895552", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit17, "SIMPELSP2020LANJUTAN", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit18, Lit19, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit21, Lit22, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit23, AlgorithmIdentifiers.NONE, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit26, "SIMPEL SP2020-V", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit27, "SP2020-V", Lit7);
    }

    public Object SP2020_V$Initialize() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit28, Lit29, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit10), Lit30, Lit31, Boolean.TRUE), Lit32);
        runtime.callComponentMethod(Lit28, Lit29, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit5), Lit30, Lit33, Boolean.TRUE), Lit34);
        runtime.callComponentMethod(Lit28, Lit29, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit8), Lit30, Lit35, Boolean.TRUE), Lit36);
        runtime.callComponentMethod(Lit28, Lit29, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit9), Lit30, Lit37, Boolean.TRUE), Lit38);
        runtime.callComponentMethod(Lit28, Lit29, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit11), Lit30, Lit39, Boolean.TRUE), Lit40);
        runtime.callComponentMethod(Lit28, Lit29, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit12), Lit30, Lit41, Boolean.TRUE), Lit42);
        runtime.callComponentMethod(Lit28, Lit29, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit13), Lit30, Lit43, Boolean.TRUE), Lit44);
        runtime.callComponentMethod(Lit28, Lit29, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit14), Lit30, Lit45, Boolean.TRUE), Lit46);
        runtime.callComponentMethod(Lit28, Lit29, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit15), Lit30, Lit47, Boolean.TRUE), Lit48);
        Object $data = runtime.callYailPrimitive(runtime.string$Mnsplit, LList.list2(runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value"), ","), Lit49, "split");
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit6, runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2($data instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit50), " is not bound in the current context"), "Unbound Variable") : $data, Lit51), Lit52, "select list item"), Lit7);
    }

    static Object lambda8() {
        return runtime.setAndCoerceProperty$Ex(Lit56, Lit57, Lit58, Lit20);
    }

    static Object lambda9() {
        return runtime.setAndCoerceProperty$Ex(Lit56, Lit57, Lit58, Lit20);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit61, Lit62, Lit63, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit61, Lit57, Lit64, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit61, Lit65, Lit64, Lit20);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit61, Lit62, Lit63, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit61, Lit57, Lit64, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit61, Lit65, Lit64, Lit20);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit68, Lit69, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit68, Lit70, Boolean.FALSE, Lit25);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit68, Lit69, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit68, Lit70, Boolean.FALSE, Lit25);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit10, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit69, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit65, Lit76, Lit20);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit10, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit69, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit65, Lit76, Lit20);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit5, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit5, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit5, Lit79, "Alamat Terisi Otomatis", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit5, Lit80, Lit81, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit5, Lit69, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit5, Lit65, Lit82, Lit20);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit5, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit5, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit5, Lit79, "Alamat Terisi Otomatis", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit5, Lit80, Lit81, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit5, Lit69, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit5, Lit65, Lit82, Lit20);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit8, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit79, "Latitude Terisi Otomatis", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit80, Lit85, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit69, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit8, Lit86, Lit51, Lit20);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit8, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit79, "Latitude Terisi Otomatis", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit80, Lit85, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit69, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit8, Lit86, Lit51, Lit20);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit9, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit79, "Longitude Terisi Otomatis", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit80, Lit89, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit69, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit9, Lit86, Lit51, Lit20);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit9, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit79, "Longitude Terisi Otomatis", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit80, Lit89, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit69, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit9, Lit86, Lit51, Lit20);
    }

    static Object lambda22() {
        return runtime.setAndCoerceProperty$Ex(Lit92, Lit57, Lit93, Lit20);
    }

    static Object lambda23() {
        return runtime.setAndCoerceProperty$Ex(Lit92, Lit57, Lit93, Lit20);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit96, Lit97, Lit98, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit96, Lit99, "01,02,03,04,05,06,07,08,09,10,11,12,13,14,15,16", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit96, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit96, Lit100, Lit51, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit96, Lit6, "Nomor Urut Ruta Sampel", Lit7);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit96, Lit97, Lit98, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit96, Lit99, "01,02,03,04,05,06,07,08,09,10,11,12,13,14,15,16", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit96, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit96, Lit100, Lit51, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit96, Lit6, "Nomor Urut Ruta Sampel", Lit7);
    }

    public Object List_PickerNUS$AfterPicking(Object $selection) {
        Object $selection2 = runtime.sanitizeComponentData($selection);
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit11, Lit6, $selection2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit102), " is not bound in the current context"), "Unbound Variable") : $selection2, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit70, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit68, Lit6, runtime.callYailPrimitive(strings.string$Mnappend, LList.list3(runtime.get$Mnproperty.apply2(Lit10, Lit6), "", runtime.get$Mnproperty.apply2(Lit11, Lit6)), Lit103, "join"), Lit7);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit11, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit69, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit86, Lit51, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit70, Boolean.FALSE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit11, Lit65, Lit107, Lit20);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit11, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit69, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit86, Lit51, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit70, Boolean.FALSE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit11, Lit65, Lit107, Lit20);
    }

    static Object lambda28() {
        return runtime.setAndCoerceProperty$Ex(Lit110, Lit57, Lit111, Lit20);
    }

    static Object lambda29() {
        return runtime.setAndCoerceProperty$Ex(Lit110, Lit57, Lit111, Lit20);
    }

    static Object lambda30() {
        runtime.setAndCoerceProperty$Ex(Lit114, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit114, Lit6, "1503. Jumlah ART (SP2020-C2 P.301) ", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit114, Lit86, Lit51, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit114, Lit115, Lit116, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit114, Lit65, Lit64, Lit20);
    }

    static Object lambda31() {
        runtime.setAndCoerceProperty$Ex(Lit114, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit114, Lit6, "1503. Jumlah ART (SP2020-C2 P.301) ", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit114, Lit86, Lit51, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit114, Lit115, Lit116, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit114, Lit65, Lit64, Lit20);
    }

    static Object lambda32() {
        runtime.setAndCoerceProperty$Ex(Lit12, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit119, Lit120, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit86, Lit51, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit12, Lit65, Lit121, Lit20);
    }

    static Object lambda33() {
        runtime.setAndCoerceProperty$Ex(Lit12, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit119, Lit120, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit86, Lit51, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit12, Lit65, Lit121, Lit20);
    }

    static Object lambda34() {
        return runtime.setAndCoerceProperty$Ex(Lit124, Lit57, Lit125, Lit20);
    }

    static Object lambda35() {
        return runtime.setAndCoerceProperty$Ex(Lit124, Lit57, Lit125, Lit20);
    }

    static Object lambda36() {
        runtime.setAndCoerceProperty$Ex(Lit128, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit128, Lit6, "1504. Jumlah Kematian (SP2020-C2 Blok VI Rincian 602)", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit128, Lit86, Lit51, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit128, Lit115, Lit129, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit128, Lit65, Lit64, Lit20);
    }

    static Object lambda37() {
        runtime.setAndCoerceProperty$Ex(Lit128, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit128, Lit6, "1504. Jumlah Kematian (SP2020-C2 Blok VI Rincian 602)", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit128, Lit86, Lit51, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit128, Lit115, Lit129, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit128, Lit65, Lit64, Lit20);
    }

    static Object lambda38() {
        return runtime.setAndCoerceProperty$Ex(Lit132, Lit57, Lit133, Lit20);
    }

    static Object lambda39() {
        return runtime.setAndCoerceProperty$Ex(Lit132, Lit57, Lit133, Lit20);
    }

    static Object lambda40() {
        runtime.setAndCoerceProperty$Ex(Lit13, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit119, Lit120, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit86, Lit51, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit13, Lit65, Lit136, Lit20);
    }

    static Object lambda41() {
        runtime.setAndCoerceProperty$Ex(Lit13, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit119, Lit120, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit86, Lit51, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit13, Lit65, Lit136, Lit20);
    }

    static Object lambda42() {
        return runtime.setAndCoerceProperty$Ex(Lit139, Lit57, Lit140, Lit20);
    }

    static Object lambda43() {
        return runtime.setAndCoerceProperty$Ex(Lit139, Lit57, Lit140, Lit20);
    }

    static Object lambda44() {
        runtime.setAndCoerceProperty$Ex(Lit143, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit6, "1505. Jumlah kematian yang berhubungan dengan kehamilan (Lihat P1612a, 1612b, 1612c, dan P1612d yang salah satu jawabannya berkode 1)", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit86, Lit51, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit115, Lit144, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit143, Lit65, Lit64, Lit20);
    }

    static Object lambda45() {
        runtime.setAndCoerceProperty$Ex(Lit143, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit6, "1505. Jumlah kematian yang berhubungan dengan kehamilan (Lihat P1612a, 1612b, 1612c, dan P1612d yang salah satu jawabannya berkode 1)", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit86, Lit51, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit115, Lit144, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit143, Lit65, Lit64, Lit20);
    }

    static Object lambda46() {
        return runtime.setAndCoerceProperty$Ex(Lit147, Lit57, Lit148, Lit20);
    }

    static Object lambda47() {
        return runtime.setAndCoerceProperty$Ex(Lit147, Lit57, Lit148, Lit20);
    }

    static Object lambda48() {
        runtime.setAndCoerceProperty$Ex(Lit14, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit14, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit14, Lit119, Lit120, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit14, Lit86, Lit51, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit14, Lit65, Lit151, Lit20);
    }

    static Object lambda49() {
        runtime.setAndCoerceProperty$Ex(Lit14, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit14, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit14, Lit119, Lit120, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit14, Lit86, Lit51, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit14, Lit65, Lit151, Lit20);
    }

    static Object lambda50() {
        return runtime.setAndCoerceProperty$Ex(Lit154, Lit57, Lit155, Lit20);
    }

    static Object lambda51() {
        return runtime.setAndCoerceProperty$Ex(Lit154, Lit57, Lit155, Lit20);
    }

    static Object lambda52() {
        runtime.setAndCoerceProperty$Ex(Lit158, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit158, Lit6, "Catatan", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit158, Lit86, Lit51, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit158, Lit115, Lit159, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit158, Lit65, Lit64, Lit20);
    }

    static Object lambda53() {
        runtime.setAndCoerceProperty$Ex(Lit158, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit158, Lit6, "Catatan", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit158, Lit86, Lit51, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit158, Lit115, Lit159, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit158, Lit65, Lit64, Lit20);
    }

    static Object lambda54() {
        runtime.setAndCoerceProperty$Ex(Lit15, Lit162, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit15, Lit65, Lit163, Lit20);
    }

    static Object lambda55() {
        runtime.setAndCoerceProperty$Ex(Lit15, Lit162, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit15, Lit65, Lit163, Lit20);
    }

    static Object lambda56() {
        return runtime.setAndCoerceProperty$Ex(Lit166, Lit57, Lit167, Lit20);
    }

    static Object lambda57() {
        return runtime.setAndCoerceProperty$Ex(Lit166, Lit57, Lit167, Lit20);
    }

    static Object lambda58() {
        runtime.setAndCoerceProperty$Ex(Lit170, Lit62, Lit63, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit170, Lit65, Lit64, Lit20);
    }

    static Object lambda59() {
        runtime.setAndCoerceProperty$Ex(Lit170, Lit62, Lit63, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit170, Lit65, Lit64, Lit20);
    }

    static Object lambda60() {
        runtime.setAndCoerceProperty$Ex(Lit173, Lit97, Lit174, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit173, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit173, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit173, Lit100, Lit51, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit173, Lit6, "KIRIM", Lit7);
    }

    static Object lambda61() {
        runtime.setAndCoerceProperty$Ex(Lit173, Lit97, Lit174, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit173, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit173, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit173, Lit100, Lit51, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit173, Lit6, "KIRIM", Lit7);
    }

    public Object ButtonKirim$Click() {
        Object andCoerceProperty$Ex;
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit10, Lit6)), Lit176, "is text empty?") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit177, Lit178, LList.list3("ID NKS Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit179);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit8, Lit6)), Lit180, "is text empty?") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit177, Lit178, LList.list3("Koordinat Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit181);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit9, Lit6)), Lit182, "is text empty?") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit177, Lit178, LList.list3("Koordinat Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit183);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit11, Lit6)), Lit184, "is text empty?") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit177, Lit178, LList.list3("Nomor Urut RUTA Sampel Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit185);
        } else if (runtime.processOrDelayed$V(new Object[]{lambda$Fn61, lambda$Fn62}) != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit177, Lit178, LList.list3("Jumlah ART Tidak Boleh Kosong, Nol Atau Minus", "Error  !!! Cek Ulang", "OK"), Lit189);
        } else if (runtime.processOrDelayed$V(new Object[]{lambda$Fn63, lambda$Fn64}) != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit177, Lit178, LList.list3("Jumlah Kematian Tidak Boleh Kosong Atau Minus", "Error  !!! Cek Ulang", "OK"), Lit192);
        } else if (runtime.processOrDelayed$V(new Object[]{lambda$Fn65, lambda$Fn66}) != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit177, Lit178, LList.list3("Jumlah Kematian Kehamilan Tidak Boleh Kosong Atau Minus", "Error  !!! Cek Ulang", "OK"), Lit195);
        } else if (runtime.callYailPrimitive(strings.string$Gr$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit14, Lit6), runtime.get$Mnproperty.apply2(Lit13, Lit6)), Lit196, "text>") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit177, Lit178, LList.list3("Isian Rincian 1505 Tidak Boleh Lebih Besar Dari Isian Rincian 1504", "Error  !!! Cek Ulang", "OK"), Lit197);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit198, Lit6)), Lit199, "is text empty?") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit198, Lit6, "Data Sudah Di kirim", Lit7);
        } else if (runtime.callComponentMethod(Lit200, Lit201, LList.Empty, LList.Empty) != Boolean.FALSE) {
            runtime.callComponentMethod(Lit177, Lit202, LList.list2("Sabar Yaaa........", "Sedang Kirim Data!!!"), Lit203);
            runtime.setAndCoerceProperty$Ex(Lit204, Lit205, runtime.callYailPrimitive(runtime.text$Mndeobfuscate, LList.list2("pvmke)7$siczno>dg]NGC\rKT]\u0015LBMYO@\u0017Q\u0016z}UAHBR\u0001]r\u0003Dda\u001e\u0006\u001f-.\u0003k\u001d02.)\b\"4\u00124\b\u001d7\u00017\u0004\u0016xc+2\u0003\u0017\u0004.'1\u001c\n\u0012.7D\u0016\u0017\u0011<\u00184\u0017\u0010+6\u0001\u001d\u001e\u0011F\u0005\f\u0006\\\u001b\u0003\u0015\u0000", "hmwvzxrb"), Lit206, "deobfuscate text"), Lit7);
            SimpleSymbol simpleSymbol = Lit204;
            SimpleSymbol simpleSymbol2 = Lit207;
            ModuleMethod moduleMethod = strings.string$Mnappend;
            Pair list1 = LList.list1("action=tambah");
            LList.chain4(LList.chain4(LList.chain4(LList.chain4(LList.chain4(list1, "&idnks=", runtime.get$Mnproperty.apply2(Lit10, Lit6), "&alamat=", runtime.get$Mnproperty.apply2(Lit5, Lit6)), "&lat=", runtime.get$Mnproperty.apply2(Lit8, Lit6), "&long=", runtime.get$Mnproperty.apply2(Lit9, Lit6)), "&nus=", runtime.get$Mnproperty.apply2(Lit11, Lit6), "&p1503=", runtime.get$Mnproperty.apply2(Lit12, Lit6)), "&p1504=", runtime.get$Mnproperty.apply2(Lit13, Lit6), "&p1505=", runtime.get$Mnproperty.apply2(Lit14, Lit6)), "&catatan=", runtime.get$Mnproperty.apply2(Lit15, Lit6), runtime.callYailPrimitive(strings.string$Mnappend, LList.list4("&idruta=", runtime.get$Mnproperty.apply2(Lit10, Lit6), "  ", runtime.get$Mnproperty.apply2(Lit11, Lit6)), Lit208, "join"), runtime.callYailPrimitive(strings.string$Mnappend, LList.list4("&latilongi=", runtime.get$Mnproperty.apply2(Lit8, Lit6), ",", runtime.get$Mnproperty.apply2(Lit9, Lit6)), Lit209, "join"));
            runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(runtime.callYailPrimitive(moduleMethod, list1, Lit210, "join")), Lit211);
            runtime.callComponentMethod(Lit212, Lit213, LList.list1(runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value")), Lit214);
            SimpleSymbol simpleSymbol3 = Lit212;
            SimpleSymbol simpleSymbol4 = Lit215;
            Object apply2 = runtime.get$Mnproperty.apply2(Lit68, Lit6);
            ModuleMethod moduleMethod2 = runtime.make$Mnyail$Mnlist;
            Pair list12 = LList.list1(runtime.get$Mnproperty.apply2(Lit68, Lit6));
            LList.chain1(LList.chain1(LList.chain4(LList.chain4(list12, runtime.get$Mnproperty.apply2(Lit10, Lit6), runtime.get$Mnproperty.apply2(Lit5, Lit6), runtime.get$Mnproperty.apply2(Lit8, Lit6), runtime.get$Mnproperty.apply2(Lit9, Lit6)), runtime.get$Mnproperty.apply2(Lit11, Lit6), runtime.get$Mnproperty.apply2(Lit12, Lit6), runtime.get$Mnproperty.apply2(Lit13, Lit6), runtime.get$Mnproperty.apply2(Lit14, Lit6)), runtime.get$Mnproperty.apply2(Lit15, Lit6)), runtime.get$Mnproperty.apply2(Lit198, Lit6));
            andCoerceProperty$Ex = runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list2(apply2, runtime.callYailPrimitive(moduleMethod2, list12, Lit216, "make a list")), Lit217);
        } else {
            runtime.callComponentMethod(Lit177, Lit178, LList.list3("Tidak Ada Jaringan, Tidak Dapat Kirim Data", "Tombol Kirim Tidak Berfungsi", "OK"), Lit218);
            andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit173, Lit219, Boolean.FALSE, Lit25);
        }
        return andCoerceProperty$Ex;
    }

    static Object lambda62() {
        return runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit12, Lit6)), Lit186, "is text empty?");
    }

    static Object lambda63() {
        return runtime.callYailPrimitive(Scheme.numLEq, LList.list2(runtime.get$Mnproperty.apply2(Lit12, Lit6), Lit187), Lit188, "<=");
    }

    static Object lambda64() {
        return runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit13, Lit6)), Lit190, "is text empty?");
    }

    static Object lambda65() {
        return runtime.callYailPrimitive(Scheme.numLss, LList.list2(runtime.get$Mnproperty.apply2(Lit13, Lit6), Lit187), Lit191, "<");
    }

    static Object lambda66() {
        return runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit14, Lit6)), Lit193, "is text empty?");
    }

    static Object lambda67() {
        return runtime.callYailPrimitive(Scheme.numLss, LList.list2(runtime.get$Mnproperty.apply2(Lit14, Lit6), Lit187), Lit194, "<");
    }

    static Object lambda68() {
        runtime.setAndCoerceProperty$Ex(Lit226, Lit97, Lit227, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit226, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit226, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit226, Lit100, Lit51, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit226, Lit6, "SIMPAN", Lit7);
    }

    static Object lambda69() {
        runtime.setAndCoerceProperty$Ex(Lit226, Lit97, Lit227, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit226, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit226, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit226, Lit100, Lit51, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit226, Lit6, "SIMPAN", Lit7);
    }

    public Object ButtonSimpan$Click() {
        Object callComponentMethod;
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit10, Lit6)), Lit229, "is text empty?") != Boolean.FALSE) {
            callComponentMethod = runtime.callComponentMethod(Lit177, Lit178, LList.list3("ID NKS Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit230);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit8, Lit6)), Lit231, "is text empty?") != Boolean.FALSE) {
            callComponentMethod = runtime.callComponentMethod(Lit177, Lit178, LList.list3("Koordinat Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit232);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit9, Lit6)), Lit233, "is text empty?") != Boolean.FALSE) {
            callComponentMethod = runtime.callComponentMethod(Lit177, Lit178, LList.list3("Koordinat Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit234);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit11, Lit6)), Lit235, "is text empty?") != Boolean.FALSE) {
            callComponentMethod = runtime.callComponentMethod(Lit177, Lit178, LList.list3("Nomor Urut RUTA Sampel Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit236);
        } else if (runtime.processOrDelayed$V(new Object[]{lambda$Fn69, lambda$Fn70}) != Boolean.FALSE) {
            callComponentMethod = runtime.callComponentMethod(Lit177, Lit178, LList.list3("Jumlah ART Tidak Boleh Kosong, Nol Atau Minus", "Error  !!! Cek Ulang", "OK"), Lit239);
        } else if (runtime.processOrDelayed$V(new Object[]{lambda$Fn71, lambda$Fn72}) != Boolean.FALSE) {
            callComponentMethod = runtime.callComponentMethod(Lit177, Lit178, LList.list3("Jumlah Kematian Tidak Boleh Kosong, Nol Atau Minus", "Error  !!! Cek Ulang", "OK"), Lit242);
        } else if (runtime.processOrDelayed$V(new Object[]{lambda$Fn73, lambda$Fn74}) != Boolean.FALSE) {
            callComponentMethod = runtime.callComponentMethod(Lit177, Lit178, LList.list3("Jumlah Kematian Kehamilan Tidak Boleh Kosong Atau Minus", "Error  !!! Cek Ulang", "OK"), Lit245);
        } else if (runtime.callYailPrimitive(strings.string$Eq$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit198, Lit6), "Data Sudah Di kirim"), Lit246, "text=") != Boolean.FALSE) {
            callComponentMethod = runtime.setAndCoerceProperty$Ex(Lit198, Lit6, "Data Belum Di kirim", Lit7);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit198, Lit6)), Lit247, "is text empty?") != Boolean.FALSE) {
            callComponentMethod = runtime.setAndCoerceProperty$Ex(Lit198, Lit6, "Data Belum Di kirim", Lit7);
        } else {
            SimpleSymbol simpleSymbol = Lit177;
            SimpleSymbol simpleSymbol2 = Lit248;
            Pair list1 = LList.list1("Simpan Data...?");
            LList.chain4(list1, "Simpan", "Ya", "Tidak", Boolean.FALSE);
            callComponentMethod = runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit249);
        }
        return callComponentMethod;
    }

    static Object lambda70() {
        return runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit12, Lit6)), Lit237, "is text empty?");
    }

    static Object lambda71() {
        return runtime.callYailPrimitive(Scheme.numLEq, LList.list2(runtime.get$Mnproperty.apply2(Lit12, Lit6), Lit187), Lit238, "<=");
    }

    static Object lambda72() {
        return runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit13, Lit6)), Lit240, "is text empty?");
    }

    static Object lambda73() {
        return runtime.callYailPrimitive(Scheme.numLss, LList.list2(runtime.get$Mnproperty.apply2(Lit13, Lit6), Lit187), Lit241, "<");
    }

    static Object lambda74() {
        return runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit14, Lit6)), Lit243, "is text empty?");
    }

    static Object lambda75() {
        return runtime.callYailPrimitive(Scheme.numLss, LList.list2(runtime.get$Mnproperty.apply2(Lit14, Lit6), Lit187), Lit244, "<");
    }

    static Object lambda76() {
        runtime.setAndCoerceProperty$Ex(Lit255, Lit97, Lit256, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit255, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit255, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit255, Lit100, Lit51, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit255, Lit6, "KEMBALI", Lit7);
    }

    static Object lambda77() {
        runtime.setAndCoerceProperty$Ex(Lit255, Lit97, Lit256, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit255, Lit73, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit255, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit255, Lit100, Lit51, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit255, Lit6, "KEMBALI", Lit7);
    }

    public Object ButtonKembali$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.close$Mnscreen$Mnwith$Mnvalue, LList.list1("SP2020_Vdata"), Lit258, "close screen with value");
    }

    static Object lambda78() {
        return runtime.setAndCoerceProperty$Ex(Lit261, Lit57, Lit262, Lit20);
    }

    static Object lambda79() {
        return runtime.setAndCoerceProperty$Ex(Lit261, Lit57, Lit262, Lit20);
    }

    static Object lambda80() {
        return runtime.setAndCoerceProperty$Ex(Lit198, Lit70, Boolean.FALSE, Lit25);
    }

    static Object lambda81() {
        return runtime.setAndCoerceProperty$Ex(Lit198, Lit70, Boolean.FALSE, Lit25);
    }

    public Object Notifier1$AfterChoosing(Object $choice) {
        Object $choice2 = runtime.sanitizeComponentData($choice);
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2($choice2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit270), " is not bound in the current context"), "Unbound Variable") : $choice2, "Ya"), Lit271, "=") != Boolean.FALSE) {
            SimpleSymbol simpleSymbol = Lit212;
            SimpleSymbol simpleSymbol2 = Lit215;
            Object apply2 = runtime.get$Mnproperty.apply2(Lit68, Lit6);
            ModuleMethod moduleMethod = runtime.make$Mnyail$Mnlist;
            Pair list1 = LList.list1(runtime.get$Mnproperty.apply2(Lit68, Lit6));
            LList.chain1(LList.chain1(LList.chain4(LList.chain4(list1, runtime.get$Mnproperty.apply2(Lit10, Lit6), runtime.get$Mnproperty.apply2(Lit5, Lit6), runtime.get$Mnproperty.apply2(Lit8, Lit6), runtime.get$Mnproperty.apply2(Lit9, Lit6)), runtime.get$Mnproperty.apply2(Lit11, Lit6), runtime.get$Mnproperty.apply2(Lit12, Lit6), runtime.get$Mnproperty.apply2(Lit13, Lit6), runtime.get$Mnproperty.apply2(Lit14, Lit6)), runtime.get$Mnproperty.apply2(Lit15, Lit6)), runtime.get$Mnproperty.apply2(Lit198, Lit6));
            runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list2(apply2, runtime.callYailPrimitive(moduleMethod, list1, Lit272, "make a list")), Lit273);
            Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St));
        }
        runtime.callComponentMethod(Lit177, Lit178, LList.list3("Berhasil Simpan Data", "Info...", "OK"), Lit274);
        return runtime.callYailPrimitive(runtime.close$Mnscreen$Mnwith$Mnvalue, LList.list1("SP2020_Vdata"), Lit275, "close screen with value");
    }

    static Object lambda82() {
        return runtime.setAndCoerceProperty$Ex(Lit212, Lit279, "TinyDB8", Lit7);
    }

    static Object lambda83() {
        return runtime.setAndCoerceProperty$Ex(Lit212, Lit279, "TinyDB8", Lit7);
    }

    public Object Web1$GotText(Object $url, Object $responseCode, Object $responseType, Object $responseContent) {
        Object callComponentMethod;
        runtime.sanitizeComponentData($url);
        Object $responseCode2 = runtime.sanitizeComponentData($responseCode);
        runtime.sanitizeComponentData($responseType);
        Object $responseContent2 = runtime.sanitizeComponentData($responseContent);
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2($responseCode2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit283), " is not bound in the current context"), "Unbound Variable") : $responseCode2, Lit284), Lit285, "=") != Boolean.FALSE) {
            runtime.addGlobalVarToCurrentFormEnvironment(Lit3, $responseContent2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit286), " is not bound in the current context"), "Unbound Variable") : $responseContent2);
            runtime.callComponentMethod(Lit0, Lit287, LList.Empty, LList.Empty);
            SimpleSymbol simpleSymbol = Lit177;
            SimpleSymbol simpleSymbol2 = Lit248;
            Pair list1 = LList.list1($responseContent2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit286), " is not bound in the current context"), "Unbound Variable") : $responseContent2);
            LList.chain4(list1, "Info", "Ok", "", Boolean.FALSE);
            runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit288);
            runtime.callComponentMethod(Lit177, Lit289, LList.Empty, LList.Empty);
            Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St));
            callComponentMethod = runtime.callYailPrimitive(runtime.close$Mnscreen$Mnwith$Mnvalue, LList.list1("SP2020_Vdata"), Lit290, "close screen with value");
        } else {
            callComponentMethod = runtime.callComponentMethod(Lit177, Lit178, LList.list3("Gagal Koneksi, Silahkan Cek Jaringan..... !", "Info", "Ok"), Lit291);
        }
        return callComponentMethod;
    }

    public Object Location_Sensor1$LocationChanged(Object $latitude, Object $longitude, Object $altitude, Object $speed) {
        Object $latitude2 = runtime.sanitizeComponentData($latitude);
        Object $longitude2 = runtime.sanitizeComponentData($longitude);
        runtime.sanitizeComponentData($altitude);
        runtime.sanitizeComponentData($speed);
        runtime.setThisForm();
        ModuleMethod moduleMethod = proc$Fn83;
        runtime.yailForEach(proc$Fn83, runtime.callComponentMethod(Lit92, Lit300, LList.Empty, LList.Empty));
        runtime.callComponentMethod(Lit92, Lit301, LList.list3($latitude2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit302), " is not bound in the current context"), "Unbound Variable") : $latitude2, $longitude2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit303), " is not bound in the current context"), "Unbound Variable") : $longitude2, Lit75), Lit304);
        SimpleSymbol simpleSymbol = Lit92;
        SimpleSymbol simpleSymbol2 = Lit305;
        ModuleMethod moduleMethod2 = strings.string$Mnappend;
        Pair list1 = LList.list1("[");
        LList.chain4(LList.chain4(list1, "{", "lat:", $latitude2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit302), " is not bound in the current context"), "Unbound Variable") : $latitude2, ","), "lng:", $longitude2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit303), " is not bound in the current context"), "Unbound Variable") : $longitude2, "}", "]");
        runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(runtime.callYailPrimitive(moduleMethod2, list1, Lit306, "join")), Lit307);
        runtime.setAndCoerceProperty$Ex(Lit5, Lit6, runtime.get$Mnproperty.apply2(Lit295, Lit308), Lit7);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit6, $latitude2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit302), " is not bound in the current context"), "Unbound Variable") : $latitude2, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit9, Lit6, $longitude2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit303), " is not bound in the current context"), "Unbound Variable") : $longitude2, Lit7);
    }

    public static Object lambda84proc(Object $item) {
        return runtime.callComponentMethod(Lit92, Lit297, LList.list1($item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit298), " is not bound in the current context"), "Unbound Variable") : $item), Lit299);
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        Object obj;
        int i = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & 1;
        if (i == 0 ? i == 0 : !this.form$Mnenvironment.isBound(name)) {
            obj = default$Mnvalue;
        } else {
            obj = this.form$Mnenvironment.get(name);
        }
        return obj;
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    @Override // com.google.appinventor.components.runtime.Form, com.google.appinventor.components.runtime.HandlesEventDispatching
    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        boolean z;
        boolean z2;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (isBoundInFormEnvironment(registeredObject)) {
            if (lookupInFormEnvironment(registeredObject) == componentObject) {
                Object handler = lookupHandler(registeredComponentName, eventName);
                try {
                    Scheme.apply.apply2(handler, LList.makeList(args, 0));
                    z2 = true;
                } catch (PermissionException exception) {
                    exception.printStackTrace();
                    boolean x = this == componentObject;
                    if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                        processException(exception);
                    } else {
                        PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                    }
                    z2 = false;
                } catch (Throwable exception2) {
                    androidLogForm(exception2.getMessage());
                    exception2.printStackTrace();
                    processException(exception2);
                    z2 = false;
                }
                z = z2;
            } else {
                z = false;
            }
        } else {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            z = false;
        }
        return z;
    }

    @Override // com.google.appinventor.components.runtime.Form, com.google.appinventor.components.runtime.HandlesEventDispatching
    public void dispatchGenericEvent(Component componentObject, String eventName, boolean notAlreadyHandled, Object[] args) {
        SimpleSymbol handler$Mnsymbol = misc.string$To$Symbol(strings.stringAppend("any$", getSimpleName(componentObject), "$", eventName));
        Object handler = lookupInFormEnvironment(handler$Mnsymbol);
        if (handler != Boolean.FALSE) {
            try {
                Scheme.apply.apply2(handler, lists.cons(componentObject, lists.cons(notAlreadyHandled ? Boolean.TRUE : Boolean.FALSE, LList.makeList(args, 0))));
            } catch (PermissionException exception) {
                exception.printStackTrace();
                boolean x = this == componentObject;
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(componentName == null ? null : componentName.toString(), eventName == null ? null : eventName.toString())));
    }

    @Override // com.google.appinventor.components.runtime.Form
    public void $define() {
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        SP2020_V = this;
        addToFormEnvironment(Lit0, this);
        LList events = this.events$Mnto$Mnregister;
        Object obj = events;
        while (true) {
            Object obj2 = obj;
            if (obj2 == LList.Empty) {
                break;
            }
            try {
                Pair arg0 = (Pair) obj2;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj3 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj3, apply12 == null ? null : apply12.toString());
                obj = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj2);
            }
        }
        try {
            Object components = lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            Object event$Mninfo2 = components;
            while (event$Mninfo2 != LList.Empty) {
                Object obj4 = event$Mninfo2;
                try {
                    Pair arg02 = (Pair) obj4;
                    Object component$Mninfo = arg02.getCar();
                    Object component$Mnname = lists.caddr.apply1(component$Mninfo);
                    lists.cadddr.apply1(component$Mninfo);
                    Object component$Mntype = lists.cadr.apply1(component$Mninfo);
                    Object apply13 = lists.car.apply1(component$Mninfo);
                    try {
                        Object component$Mncontainer = lookupInFormEnvironment((Symbol) apply13);
                        Object component$Mnobject = Invoke.make.apply2(component$Mntype, component$Mncontainer);
                        SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                        try {
                            addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
                            event$Mninfo2 = arg02.getCdr();
                        } catch (ClassCastException e2) {
                            throw new WrongType(e2, "add-to-form-environment", 0, component$Mnname);
                        }
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "lookup-in-form-environment", 0, apply13);
                    }
                } catch (ClassCastException e4) {
                    throw new WrongType(e4, "arg0", -2, obj4);
                }
            }
            LList var$Mnval$Mnpairs = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            LList lList = var$Mnval$Mnpairs;
            while (lList != LList.Empty) {
                LList lList2 = lList;
                try {
                    Pair arg03 = (Pair) lList2;
                    Object var$Mnval = arg03.getCar();
                    Object var = lists.car.apply1(var$Mnval);
                    Object val$Mnthunk = lists.cadr.apply1(var$Mnval);
                    try {
                        addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(val$Mnthunk));
                        lList = arg03.getCdr();
                    } catch (ClassCastException e5) {
                        throw new WrongType(e5, "add-to-global-var-environment", 0, var);
                    }
                } catch (ClassCastException e6) {
                    throw new WrongType(e6, "arg0", -2, lList2);
                }
            }
            LList var$Mnval$Mnpairs2 = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (var$Mnval$Mnpairs2 != LList.Empty) {
                LList lList3 = var$Mnval$Mnpairs2;
                try {
                    Pair arg04 = (Pair) lList3;
                    misc.force(arg04.getCar());
                    var$Mnval$Mnpairs2 = arg04.getCdr();
                } catch (ClassCastException e7) {
                    throw new WrongType(e7, "arg0", -2, lList3);
                }
            }
            Object obj5 = components;
            while (obj5 != LList.Empty) {
                Object obj6 = obj5;
                try {
                    Pair arg05 = (Pair) obj6;
                    Object component$Mninfo2 = arg05.getCar();
                    lists.caddr.apply1(component$Mninfo2);
                    Object init$Mnthunk = lists.cadddr.apply1(component$Mninfo2);
                    if (init$Mnthunk != Boolean.FALSE) {
                        Scheme.applyToArgs.apply1(init$Mnthunk);
                    }
                    obj5 = arg05.getCdr();
                } catch (ClassCastException e8) {
                    throw new WrongType(e8, "arg0", -2, obj6);
                }
            }
            Object obj7 = components;
            while (obj7 != LList.Empty) {
                Object obj8 = obj7;
                try {
                    Pair arg06 = (Pair) obj8;
                    Object component$Mninfo3 = arg06.getCar();
                    Object component$Mnname2 = lists.caddr.apply1(component$Mninfo3);
                    lists.cadddr.apply1(component$Mninfo3);
                    callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                    obj7 = arg06.getCdr();
                } catch (ClassCastException e9) {
                    throw new WrongType(e9, "arg0", -2, obj8);
                }
            }
        } catch (YailRuntimeError exception2) {
            processException(exception2);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        LList symbols = LList.makeList(argsArray, 0);
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = symbols;
        Object obj2 = LList.Empty;
        while (true) {
            Object obj3 = obj2;
            Object obj4 = obj;
            if (obj4 != LList.Empty) {
                try {
                    Pair arg0 = (Pair) obj4;
                    obj = arg0.getCdr();
                    Object car = arg0.getCar();
                    try {
                        obj2 = Pair.make(((Symbol) car).toString(), obj3);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "symbol->string", 1, car);
                    }
                } catch (ClassCastException e2) {
                    throw new WrongType(e2, "arg0", -2, obj4);
                }
            } else {
                Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj3));
                try {
                    return misc.string$To$Symbol((CharSequence) apply2);
                } catch (ClassCastException e3) {
                    throw new WrongType(e3, "string->symbol", 1, apply2);
                }
            }
        }
    }

    static Object lambda2() {
        return null;
    }
}
