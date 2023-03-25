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
import com.google.appinventor.components.runtime.LocationSensor;
import com.google.appinventor.components.runtime.MakeroidCardView;
import com.google.appinventor.components.runtime.Network;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.SpaceView;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.TinyDB;
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
/* compiled from: Screen_SLSInput.yail */
/* loaded from: classes.dex */
public class Screen_SLSInput extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final SimpleSymbol Lit100;
    static final IntNum Lit101;
    static final FString Lit102;
    static final FString Lit103;
    static final SimpleSymbol Lit104;
    static final FString Lit105;
    static final FString Lit106;
    static final SimpleSymbol Lit107;
    static final IntNum Lit108;
    static final FString Lit109;
    static final SimpleSymbol Lit11;
    static final FString Lit110;
    static final SimpleSymbol Lit111;
    static final IntNum Lit112;
    static final FString Lit113;
    static final FString Lit114;
    static final SimpleSymbol Lit115;
    static final IntNum Lit116;
    static final FString Lit117;
    static final FString Lit118;
    static final SimpleSymbol Lit119;
    static final SimpleSymbol Lit12;
    static final IntNum Lit120;
    static final FString Lit121;
    static final FString Lit122;
    static final FString Lit123;
    static final PairWithPosition Lit124;
    static final SimpleSymbol Lit125;
    static final SimpleSymbol Lit126;
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
    static final SimpleSymbol Lit136;
    static final IntNum Lit137;
    static final FString Lit138;
    static final FString Lit139;
    static final SimpleSymbol Lit14;
    static final IntNum Lit140;
    static final FString Lit141;
    static final FString Lit142;
    static final SimpleSymbol Lit143;
    static final IntNum Lit144;
    static final FString Lit145;
    static final FString Lit146;
    static final IntNum Lit147;
    static final FString Lit148;
    static final PairWithPosition Lit149;
    static final SimpleSymbol Lit15;
    static final SimpleSymbol Lit150;
    static final FString Lit151;
    static final SimpleSymbol Lit152;
    static final IntNum Lit153;
    static final FString Lit154;
    static final FString Lit155;
    static final SimpleSymbol Lit156;
    static final IntNum Lit157;
    static final FString Lit158;
    static final FString Lit159;
    static final SimpleSymbol Lit16;
    static final SimpleSymbol Lit160;
    static final IntNum Lit161;
    static final FString Lit162;
    static final FString Lit163;
    static final SimpleSymbol Lit164;
    static final IntNum Lit165;
    static final FString Lit166;
    static final FString Lit167;
    static final SimpleSymbol Lit168;
    static final FString Lit169;
    static final SimpleSymbol Lit17;
    static final FString Lit170;
    static final SimpleSymbol Lit171;
    static final SimpleSymbol Lit172;
    static final IntNum Lit173;
    static final SimpleSymbol Lit174;
    static final FString Lit175;
    static final PairWithPosition Lit176;
    static final PairWithPosition Lit177;
    static final SimpleSymbol Lit178;
    static final SimpleSymbol Lit179;
    static final SimpleSymbol Lit18;
    static final PairWithPosition Lit180;
    static final PairWithPosition Lit181;
    static final PairWithPosition Lit182;
    static final PairWithPosition Lit183;
    static final PairWithPosition Lit184;
    static final PairWithPosition Lit185;
    static final PairWithPosition Lit186;
    static final PairWithPosition Lit187;
    static final PairWithPosition Lit188;
    static final PairWithPosition Lit189;
    static final IntNum Lit19;
    static final PairWithPosition Lit190;
    static final PairWithPosition Lit191;
    static final PairWithPosition Lit192;
    static final SimpleSymbol Lit193;
    static final PairWithPosition Lit194;
    static final SimpleSymbol Lit195;
    static final SimpleSymbol Lit196;
    static final SimpleSymbol Lit197;
    static final PairWithPosition Lit198;
    static final SimpleSymbol Lit199;
    static final SimpleSymbol Lit2;
    static final IntNum Lit20;
    static final SimpleSymbol Lit200;
    static final PairWithPosition Lit201;
    static final SimpleSymbol Lit202;
    static final PairWithPosition Lit203;
    static final PairWithPosition Lit204;
    static final PairWithPosition Lit205;
    static final SimpleSymbol Lit206;
    static final SimpleSymbol Lit207;
    static final PairWithPosition Lit208;
    static final SimpleSymbol Lit209;
    static final PairWithPosition Lit21;
    static final PairWithPosition Lit210;
    static final PairWithPosition Lit211;
    static final PairWithPosition Lit212;
    static final SimpleSymbol Lit213;
    static final SimpleSymbol Lit214;
    static final SimpleSymbol Lit215;
    static final FString Lit216;
    static final SimpleSymbol Lit217;
    static final IntNum Lit218;
    static final IntNum Lit219;
    static final SimpleSymbol Lit22;
    static final FString Lit220;
    static final FString Lit221;
    static final SimpleSymbol Lit222;
    static final IntNum Lit223;
    static final FString Lit224;
    static final PairWithPosition Lit225;
    static final PairWithPosition Lit226;
    static final PairWithPosition Lit227;
    static final PairWithPosition Lit228;
    static final PairWithPosition Lit229;
    static final IntNum Lit23;
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
    static final PairWithPosition Lit24;
    static final PairWithPosition Lit240;
    static final SimpleSymbol Lit241;
    static final PairWithPosition Lit242;
    static final SimpleSymbol Lit243;
    static final FString Lit244;
    static final SimpleSymbol Lit245;
    static final IntNum Lit246;
    static final IntNum Lit247;
    static final FString Lit248;
    static final FString Lit249;
    static final SimpleSymbol Lit25;
    static final SimpleSymbol Lit250;
    static final IntNum Lit251;
    static final FString Lit252;
    static final PairWithPosition Lit253;
    static final SimpleSymbol Lit254;
    static final FString Lit255;
    static final SimpleSymbol Lit256;
    static final IntNum Lit257;
    static final FString Lit258;
    static final FString Lit259;
    static final SimpleSymbol Lit26;
    static final FString Lit260;
    static final FString Lit261;
    static final FString Lit262;
    static final FString Lit263;
    static final FString Lit264;
    static final SimpleSymbol Lit265;
    static final IntNum Lit266;
    static final PairWithPosition Lit267;
    static final SimpleSymbol Lit268;
    static final SimpleSymbol Lit269;
    static final IntNum Lit27;
    static final SimpleSymbol Lit270;
    static final PairWithPosition Lit271;
    static final PairWithPosition Lit272;
    static final PairWithPosition Lit273;
    static final SimpleSymbol Lit274;
    static final SimpleSymbol Lit275;
    static final FString Lit276;
    static final SimpleSymbol Lit277;
    static final FString Lit278;
    static final FString Lit279;
    static final SimpleSymbol Lit28;
    static final FString Lit280;
    static final FString Lit281;
    static final SimpleSymbol Lit282;
    static final FString Lit283;
    static final FString Lit284;
    static final SimpleSymbol Lit285;
    static final FString Lit286;
    static final SimpleSymbol Lit287;
    static final SimpleSymbol Lit288;
    static final PairWithPosition Lit289;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit290;
    static final SimpleSymbol Lit291;
    static final SimpleSymbol Lit292;
    static final SimpleSymbol Lit293;
    static final PairWithPosition Lit294;
    static final SimpleSymbol Lit295;
    static final PairWithPosition Lit296;
    static final PairWithPosition Lit297;
    static final SimpleSymbol Lit298;
    static final SimpleSymbol Lit299;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final SimpleSymbol Lit300;
    static final FString Lit301;
    static final FString Lit302;
    static final SimpleSymbol Lit303;
    static final PairWithPosition Lit304;
    static final PairWithPosition Lit305;
    static final PairWithPosition Lit306;
    static final PairWithPosition Lit307;
    static final PairWithPosition Lit308;
    static final SimpleSymbol Lit31;
    static final IntNum Lit32;
    static final SimpleSymbol Lit33;
    static final IntNum Lit34;
    static final SimpleSymbol Lit35;
    static final SimpleSymbol Lit36;
    static final SimpleSymbol Lit37;
    static final SimpleSymbol Lit38;
    static final SimpleSymbol Lit39;
    static final SimpleSymbol Lit4;
    static final IntNum Lit40;
    static final PairWithPosition Lit41;
    static final IntNum Lit42;
    static final PairWithPosition Lit43;
    static final IntNum Lit44;
    static final PairWithPosition Lit45;
    static final IntNum Lit46;
    static final PairWithPosition Lit47;
    static final IntNum Lit48;
    static final PairWithPosition Lit49;
    static final SimpleSymbol Lit5;
    static final IntNum Lit50;
    static final PairWithPosition Lit51;
    static final IntNum Lit52;
    static final PairWithPosition Lit53;
    static final SimpleSymbol Lit54;
    static final IntNum Lit55;
    static final PairWithPosition Lit56;
    static final IntNum Lit57;
    static final PairWithPosition Lit58;
    static final PairWithPosition Lit59;
    static final SimpleSymbol Lit6;
    static final SimpleSymbol Lit60;
    static final IntNum Lit61;
    static final PairWithPosition Lit62;
    static final SimpleSymbol Lit63;
    static final SimpleSymbol Lit64;
    static final FString Lit65;
    static final SimpleSymbol Lit66;
    static final SimpleSymbol Lit67;
    static final IntNum Lit68;
    static final FString Lit69;
    static final SimpleSymbol Lit7;
    static final FString Lit70;
    static final SimpleSymbol Lit71;
    static final SimpleSymbol Lit72;
    static final IntNum Lit73;
    static final FString Lit74;
    static final FString Lit75;
    static final SimpleSymbol Lit76;
    static final SimpleSymbol Lit77;
    static final SimpleSymbol Lit78;
    static final SimpleSymbol Lit79;
    static final SimpleSymbol Lit8;
    static final FString Lit80;
    static final FString Lit81;
    static final SimpleSymbol Lit82;
    static final SimpleSymbol Lit83;
    static final SimpleSymbol Lit84;
    static final SimpleSymbol Lit85;
    static final IntNum Lit86;
    static final FString Lit87;
    static final FString Lit88;
    static final SimpleSymbol Lit89;
    static final SimpleSymbol Lit9;
    static final IntNum Lit90;
    static final IntNum Lit91;
    static final FString Lit92;
    static final FString Lit93;
    static final FString Lit94;
    static final FString Lit95;
    static final FString Lit96;
    static final FString Lit97;
    static final FString Lit98;
    static final FString Lit99;
    public static Screen_SLSInput Screen_SLSInput;
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
    static final ModuleMethod lambda$Fn75 = null;
    static final ModuleMethod lambda$Fn76 = null;
    static final ModuleMethod lambda$Fn77 = null;
    static final ModuleMethod lambda$Fn78 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    static final ModuleMethod proc$Fn74 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public ActivityStarter Activity_Starter1;
    public Button ButtonKembali;
    public final ModuleMethod ButtonKembali$Click;
    public Button ButtonKirim;
    public final ModuleMethod ButtonKirim$Click;
    public Button ButtonSimpan;
    public final ModuleMethod ButtonSimpan$Click;
    public MakeroidCardView Card_View1;
    public MakeroidCardView Card_View2;
    public Clock Clock1;
    public Decoration Decoration1;
    public GoogleMap Google_Maps1;
    public HorizontalArrangement Horizontal_ArrangementKirim;
    public Label Label1;
    public Label Label1_copy;
    public Label Label2;
    public Label Label4;
    public Label Label5;
    public Label Label5_copy;
    public Label Label5_copy_copy;
    public LocationSensor Location_Sensor1;
    public final ModuleMethod Location_Sensor1$LocationChanged;
    public Network Network1;
    public Notifier Notifier1;
    public final ModuleMethod Notifier1$AfterChoosing;
    public final ModuleMethod Screen_SLSInput$Initialize;
    public SpaceView Space1;
    public SpaceView Space2;
    public SpaceView Space2_copy;
    public SpaceView Space2_copy1;
    public SpaceView Space2_copy2;
    public SpaceView Space2_copy3;
    public SpaceView Space2_copy3_copy;
    public SpaceView Space2_copy5;
    public TextBox Text_BoxAlamat;
    public TextBox Text_BoxCatatan;
    public TextBox Text_BoxHP;
    public final ModuleMethod Text_BoxHP$GotFocus;
    public TextBox Text_BoxIDSLS;
    public TextBox Text_BoxInfo;
    public TextBox Text_BoxLatitude;
    public TextBox Text_BoxLongitude;
    public TextBox Text_BoxNKS;
    public TextBox Text_BoxNama;
    public TextBox Text_BoxRT;
    public TextBox Text_BoxRW;
    public final ModuleMethod Text_BoxRW$GotFocus;
    public TinyDB Tiny_DB1;
    public TinyDB Tiny_DB14;
    public TinyDB Tiny_DB2;
    public Web Web1;
    public final ModuleMethod Web1$GotText;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public final ModuleMethod any$TextBox$GotFocus;
    public final ModuleMethod any$TextBox$LostFocus;
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
    static final SimpleSymbol Lit336 = (SimpleSymbol) new SimpleSymbol("component").readResolve();
    static final SimpleSymbol Lit335 = (SimpleSymbol) new SimpleSymbol("any").readResolve();
    static final SimpleSymbol Lit334 = (SimpleSymbol) new SimpleSymbol("proc").readResolve();
    static final SimpleSymbol Lit333 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
    static final SimpleSymbol Lit332 = (SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve();
    static final SimpleSymbol Lit331 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
    static final SimpleSymbol Lit330 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
    static final SimpleSymbol Lit329 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
    static final SimpleSymbol Lit328 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
    static final SimpleSymbol Lit327 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
    static final SimpleSymbol Lit326 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
    static final SimpleSymbol Lit325 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
    static final SimpleSymbol Lit324 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
    static final SimpleSymbol Lit323 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
    static final SimpleSymbol Lit322 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
    static final SimpleSymbol Lit321 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
    static final SimpleSymbol Lit320 = (SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve();
    static final FString Lit319 = new FString("com.google.appinventor.components.runtime.Network");
    static final FString Lit318 = new FString("com.google.appinventor.components.runtime.Network");
    static final FString Lit317 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final SimpleSymbol Lit316 = (SimpleSymbol) new SimpleSymbol("Tiny_DB14").readResolve();
    static final FString Lit315 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit314 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final SimpleSymbol Lit313 = (SimpleSymbol) new SimpleSymbol("Namespace").readResolve();
    static final SimpleSymbol Lit312 = (SimpleSymbol) new SimpleSymbol("Tiny_DB2").readResolve();
    static final FString Lit311 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final SimpleSymbol Lit310 = (SimpleSymbol) new SimpleSymbol("AfterChoosing").readResolve();
    static final SimpleSymbol Lit309 = (SimpleSymbol) new SimpleSymbol("Notifier1$AfterChoosing").readResolve();

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit6 = simpleSymbol;
        Lit308 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1864691), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1864686), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1864680);
        Lit307 = PairWithPosition.make(Lit335, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1864531);
        Lit306 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit335, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1864421), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1864415);
        Lit305 = PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1864392), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1864388), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1864384), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1864380), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1864376), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1864372), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1864368), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1864364), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1864360), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1864356), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1864351);
        Lit304 = PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1863778), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1863773);
        Lit303 = (SimpleSymbol) new SimpleSymbol("$choice").readResolve();
        Lit302 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit301 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit300 = (SimpleSymbol) new SimpleSymbol("LocationChanged").readResolve();
        Lit299 = (SimpleSymbol) new SimpleSymbol("Location_Sensor1$LocationChanged").readResolve();
        Lit298 = (SimpleSymbol) new SimpleSymbol("CurrentAddress").readResolve();
        Lit297 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1835654);
        Lit296 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1835637), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1835632), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1835627), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1835622), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1835617), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1835612), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1835607), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1835602), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1835596);
        Lit295 = (SimpleSymbol) new SimpleSymbol("AddMarkersFromJson").readResolve();
        SimpleSymbol simpleSymbol2 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit28 = simpleSymbol2;
        Lit294 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1835366), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1835359), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1835351);
        Lit293 = (SimpleSymbol) new SimpleSymbol("$longitude").readResolve();
        Lit292 = (SimpleSymbol) new SimpleSymbol("$latitude").readResolve();
        Lit291 = (SimpleSymbol) new SimpleSymbol("MoveCamera").readResolve();
        Lit290 = (SimpleSymbol) new SimpleSymbol("GetAllMarkerID").readResolve();
        Lit289 = PairWithPosition.make(Lit28, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1835132);
        Lit288 = (SimpleSymbol) new SimpleSymbol("$item").readResolve();
        Lit287 = (SimpleSymbol) new SimpleSymbol("RemoveMarker").readResolve();
        Lit286 = new FString("com.google.appinventor.components.runtime.LocationSensor");
        Lit285 = (SimpleSymbol) new SimpleSymbol("Location_Sensor1").readResolve();
        Lit284 = new FString("com.google.appinventor.components.runtime.LocationSensor");
        Lit283 = new FString("com.google.appinventor.components.runtime.Clock");
        Lit282 = (SimpleSymbol) new SimpleSymbol("Clock1").readResolve();
        Lit281 = new FString("com.google.appinventor.components.runtime.Clock");
        Lit280 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit279 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit278 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
        Lit277 = (SimpleSymbol) new SimpleSymbol("Activity_Starter1").readResolve();
        Lit276 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
        Lit275 = (SimpleSymbol) new SimpleSymbol("GotText").readResolve();
        Lit274 = (SimpleSymbol) new SimpleSymbol("Web1$GotText").readResolve();
        Lit273 = PairWithPosition.make(Lit335, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1745695);
        Lit272 = PairWithPosition.make(Lit335, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1745495);
        SimpleSymbol simpleSymbol3 = Lit6;
        SimpleSymbol simpleSymbol4 = Lit6;
        SimpleSymbol simpleSymbol5 = Lit6;
        SimpleSymbol simpleSymbol6 = Lit6;
        SimpleSymbol simpleSymbol7 = (SimpleSymbol) new SimpleSymbol("boolean").readResolve();
        Lit37 = simpleSymbol7;
        Lit271 = PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, PairWithPosition.make(simpleSymbol6, PairWithPosition.make(simpleSymbol7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1745381), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1745376), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1745371), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1745366), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1745360);
        Lit270 = (SimpleSymbol) new SimpleSymbol("DismissProgressDialog").readResolve();
        Lit269 = (SimpleSymbol) new SimpleSymbol("HideKeyboard").readResolve();
        Lit268 = (SimpleSymbol) new SimpleSymbol("$responseContent").readResolve();
        Lit267 = PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1744999), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1744994);
        Lit266 = IntNum.make(200);
        Lit265 = (SimpleSymbol) new SimpleSymbol("$responseCode").readResolve();
        Lit264 = new FString("com.google.appinventor.components.runtime.Web");
        Lit263 = new FString("com.google.appinventor.components.runtime.Web");
        Lit262 = new FString("com.google.appinventor.components.runtime.Decoration");
        Lit261 = new FString("com.google.appinventor.components.runtime.Decoration");
        Lit260 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit259 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit258 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit257 = IntNum.make(-1003);
        Lit256 = (SimpleSymbol) new SimpleSymbol("Space2_copy3").readResolve();
        Lit255 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit254 = (SimpleSymbol) new SimpleSymbol("ButtonKembali$Click").readResolve();
        Lit253 = PairWithPosition.make(Lit335, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1638489);
        Lit252 = new FString("com.google.appinventor.components.runtime.Button");
        Lit251 = IntNum.make(new int[]{-17625851});
        Lit250 = (SimpleSymbol) new SimpleSymbol("ButtonKembali").readResolve();
        Lit249 = new FString("com.google.appinventor.components.runtime.Button");
        Lit248 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit247 = IntNum.make(-1002);
        Lit246 = IntNum.make(-1003);
        Lit245 = (SimpleSymbol) new SimpleSymbol("Space2_copy5").readResolve();
        Lit244 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit243 = (SimpleSymbol) new SimpleSymbol("ButtonSimpan$Click").readResolve();
        Lit242 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit37, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1542795), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1542790), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1542785), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1542780), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1542774);
        Lit241 = (SimpleSymbol) new SimpleSymbol("ShowChooseDialog").readResolve();
        Lit240 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1542532);
        Lit239 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1542329), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1542323);
        Lit238 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1542195), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1542190), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1542184);
        Lit237 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1541968);
        Lit236 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1541859), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1541854), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1541848);
        Lit235 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1541672);
        Lit234 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1541563), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1541558), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1541552);
        Lit233 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1541381);
        Lit232 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1541272), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1541267), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1541261);
        Lit231 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1541078);
        Lit230 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1540967), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1540962), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1540956);
        Lit229 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1540786);
        Lit228 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1540670), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1540665), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1540659);
        Lit227 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1540489);
        Lit226 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1540374), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1540369), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1540363);
        Lit225 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1540196);
        Lit224 = new FString("com.google.appinventor.components.runtime.Button");
        Lit223 = IntNum.make(new int[]{-16294316});
        Lit222 = (SimpleSymbol) new SimpleSymbol("ButtonSimpan").readResolve();
        Lit221 = new FString("com.google.appinventor.components.runtime.Button");
        Lit220 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit219 = IntNum.make(-1002);
        Lit218 = IntNum.make(-1003);
        Lit217 = (SimpleSymbol) new SimpleSymbol("Space2").readResolve();
        Lit216 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit215 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit214 = (SimpleSymbol) new SimpleSymbol("ButtonKirim$Click").readResolve();
        Lit213 = (SimpleSymbol) new SimpleSymbol("Enabled").readResolve();
        Lit212 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1446743), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1446738), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1446732);
        Lit211 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit335, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1446558), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1446552);
        Lit210 = PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, PairWithPosition.make(Lit335, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1446529), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1446525), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1446521), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1446517), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1446513), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1446509), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1446505), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1446501), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1446497), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1446493), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1446488);
        Lit209 = (SimpleSymbol) new SimpleSymbol("StoreValue").readResolve();
        Lit208 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445927);
        Lit207 = (SimpleSymbol) new SimpleSymbol("ClearTag").readResolve();
        Lit206 = (SimpleSymbol) new SimpleSymbol("Tiny_DB1").readResolve();
        Lit205 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445773);
        Lit204 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445756), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445751), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445746), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445741), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445736), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445731), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445726), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445721), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445716), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445711), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445706), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445701), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445696), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445691), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445686), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445681), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445676), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445671), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445666), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445660);
        Lit203 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445642), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445637), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445632), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1445626);
        Lit202 = (SimpleSymbol) new SimpleSymbol("PostText").readResolve();
        Lit201 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1444907), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1444901);
        Lit200 = (SimpleSymbol) new SimpleSymbol("Url").readResolve();
        Lit199 = (SimpleSymbol) new SimpleSymbol("Web1").readResolve();
        Lit198 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1444505), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1444499);
        Lit197 = (SimpleSymbol) new SimpleSymbol("ShowProgressDialog").readResolve();
        Lit196 = (SimpleSymbol) new SimpleSymbol("IsConnected").readResolve();
        Lit195 = (SimpleSymbol) new SimpleSymbol("Network1").readResolve();
        Lit194 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1444176);
        Lit193 = (SimpleSymbol) new SimpleSymbol("Text_BoxInfo").readResolve();
        Lit192 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1444065), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1444060), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1444054);
        Lit191 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1443838);
        Lit190 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1443729), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1443724), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1443718);
        Lit189 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1443542);
        Lit188 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1443433), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1443428), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1443422);
        Lit187 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1443251);
        Lit186 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1443142), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1443137), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1443131);
        Lit185 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1442948);
        Lit184 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1442837), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1442832), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1442826);
        Lit183 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1442656);
        Lit182 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1442540), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1442535), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1442529);
        Lit181 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1442359);
        Lit180 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1442244), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1442239), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1442233);
        Lit179 = (SimpleSymbol) new SimpleSymbol("ShowMessageDialog").readResolve();
        Lit178 = (SimpleSymbol) new SimpleSymbol("Notifier1").readResolve();
        Lit177 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1442066);
        Lit176 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1441948);
        Lit175 = new FString("com.google.appinventor.components.runtime.Button");
        Lit174 = (SimpleSymbol) new SimpleSymbol("Shape").readResolve();
        Lit173 = IntNum.make(new int[]{-32885510});
        Lit172 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit171 = (SimpleSymbol) new SimpleSymbol("ButtonKirim").readResolve();
        Lit170 = new FString("com.google.appinventor.components.runtime.Button");
        Lit169 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit168 = (SimpleSymbol) new SimpleSymbol("Horizontal_ArrangementKirim").readResolve();
        Lit167 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit166 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit165 = IntNum.make(-1003);
        Lit164 = (SimpleSymbol) new SimpleSymbol("Space2_copy3_copy").readResolve();
        Lit163 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit162 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit161 = IntNum.make(-1085);
        Lit160 = (SimpleSymbol) new SimpleSymbol("MultiLine").readResolve();
        Lit159 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit158 = new FString("com.google.appinventor.components.runtime.Label");
        Lit157 = IntNum.make(new int[]{-32885510});
        Lit156 = (SimpleSymbol) new SimpleSymbol("Label1").readResolve();
        Lit155 = new FString("com.google.appinventor.components.runtime.Label");
        Lit154 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit153 = IntNum.make(-1003);
        Lit152 = (SimpleSymbol) new SimpleSymbol("Space2_copy2").readResolve();
        Lit151 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit150 = (SimpleSymbol) new SimpleSymbol("Text_BoxRW$GotFocus").readResolve();
        Lit149 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1163455), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1163450), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 1163444);
        Lit148 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit147 = IntNum.make(-1025);
        Lit146 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit145 = new FString("com.google.appinventor.components.runtime.Label");
        Lit144 = IntNum.make(new int[]{-17625851});
        Lit143 = (SimpleSymbol) new SimpleSymbol("Label5_copy").readResolve();
        Lit142 = new FString("com.google.appinventor.components.runtime.Label");
        Lit141 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit140 = IntNum.make(-1025);
        Lit139 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit138 = new FString("com.google.appinventor.components.runtime.Label");
        Lit137 = IntNum.make(new int[]{-17625851});
        Lit136 = (SimpleSymbol) new SimpleSymbol("Label5_copy_copy").readResolve();
        Lit135 = new FString("com.google.appinventor.components.runtime.Label");
        Lit134 = new FString("com.google.appinventor.components.runtime.Label");
        Lit133 = IntNum.make(new int[]{-32885510});
        Lit132 = (SimpleSymbol) new SimpleSymbol("Label5").readResolve();
        Lit131 = new FString("com.google.appinventor.components.runtime.Label");
        Lit130 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit129 = IntNum.make(-1003);
        Lit128 = (SimpleSymbol) new SimpleSymbol("Space2_copy1").readResolve();
        Lit127 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit126 = (SimpleSymbol) new SimpleSymbol("GotFocus").readResolve();
        Lit125 = (SimpleSymbol) new SimpleSymbol("Text_BoxHP$GotFocus").readResolve();
        Lit124 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 819350);
        Lit123 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit122 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit121 = new FString("com.google.appinventor.components.runtime.Label");
        Lit120 = IntNum.make(new int[]{-32885510});
        Lit119 = (SimpleSymbol) new SimpleSymbol("Label1_copy").readResolve();
        Lit118 = new FString("com.google.appinventor.components.runtime.Label");
        Lit117 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit116 = IntNum.make(-1003);
        Lit115 = (SimpleSymbol) new SimpleSymbol("Space2_copy").readResolve();
        Lit114 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit113 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit112 = IntNum.make(15);
        Lit111 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit110 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit109 = new FString("com.google.appinventor.components.runtime.Label");
        Lit108 = IntNum.make(new int[]{-32885510});
        Lit107 = (SimpleSymbol) new SimpleSymbol("Label4").readResolve();
        Lit106 = new FString("com.google.appinventor.components.runtime.Label");
        Lit105 = new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit104 = (SimpleSymbol) new SimpleSymbol("Card_View2").readResolve();
        Lit103 = new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit102 = new FString("com.google.appinventor.components.runtime.GoogleMap");
        Lit101 = IntNum.make(-1010);
        Lit100 = (SimpleSymbol) new SimpleSymbol("Google_Maps1").readResolve();
        Lit99 = new FString("com.google.appinventor.components.runtime.GoogleMap");
        Lit98 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit97 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit96 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit95 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit94 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit93 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit92 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit91 = IntNum.make(-1025);
        Lit90 = IntNum.make(5);
        Lit89 = (SimpleSymbol) new SimpleSymbol("InputType").readResolve();
        Lit88 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit87 = new FString("com.google.appinventor.components.runtime.Label");
        Lit86 = IntNum.make(new int[]{-32885510});
        Lit85 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit84 = (SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve();
        Lit83 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        Lit82 = (SimpleSymbol) new SimpleSymbol("Label2").readResolve();
        Lit81 = new FString("com.google.appinventor.components.runtime.Label");
        Lit80 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit79 = (SimpleSymbol) new SimpleSymbol("Visible").readResolve();
        Lit78 = (SimpleSymbol) new SimpleSymbol("ReadOnly").readResolve();
        Lit77 = (SimpleSymbol) new SimpleSymbol("Hint").readResolve();
        Lit76 = (SimpleSymbol) new SimpleSymbol("Text_BoxIDSLS").readResolve();
        Lit75 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit74 = new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit73 = IntNum.make(-2);
        Lit72 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit71 = (SimpleSymbol) new SimpleSymbol("Card_View1").readResolve();
        Lit70 = new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit69 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit68 = IntNum.make(-1003);
        Lit67 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit66 = (SimpleSymbol) new SimpleSymbol("Space1").readResolve();
        Lit65 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit64 = (SimpleSymbol) new SimpleSymbol("Initialize").readResolve();
        Lit63 = (SimpleSymbol) new SimpleSymbol("Screen_SLSInput$Initialize").readResolve();
        Lit62 = PairWithPosition.make((SimpleSymbol) new SimpleSymbol("list").readResolve(), PairWithPosition.make(Lit28, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 120439), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 120433);
        Lit61 = IntNum.make(1);
        Lit60 = (SimpleSymbol) new SimpleSymbol("$data").readResolve();
        Lit59 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 120281), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 120275);
        Lit58 = PairWithPosition.make(Lit336, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit37, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 120110), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 120103), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 120096), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 120085);
        Lit57 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit56 = PairWithPosition.make(Lit336, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit37, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119960), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119953), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119946), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119935);
        Lit55 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit54 = (SimpleSymbol) new SimpleSymbol("Text_BoxRW").readResolve();
        Lit53 = PairWithPosition.make(Lit336, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit37, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119815), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119808), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119801), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119790);
        Lit52 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit51 = PairWithPosition.make(Lit336, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit37, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119670), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119663), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119656), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119645);
        Lit50 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit49 = PairWithPosition.make(Lit336, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit37, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119525), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119518), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119511), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119500);
        Lit48 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit47 = PairWithPosition.make(Lit336, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit37, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119378), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119371), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119364), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119353);
        Lit46 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit45 = PairWithPosition.make(Lit336, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit37, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119226), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119219), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119212), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119201);
        Lit44 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit43 = PairWithPosition.make(Lit336, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit37, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119075), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119068), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119061), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 119050);
        Lit42 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit41 = PairWithPosition.make(Lit336, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit37, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 118926), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 118919), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 118912), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 118901);
        Lit40 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit39 = (SimpleSymbol) new SimpleSymbol("TitleBarSubTitle").readResolve();
        Lit38 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit36 = (SimpleSymbol) new SimpleSymbol("Scrollable").readResolve();
        Lit35 = (SimpleSymbol) new SimpleSymbol("ReceiveSharedText").readResolve();
        Lit34 = IntNum.make(new int[]{-33408463});
        Lit33 = (SimpleSymbol) new SimpleSymbol("PrimaryColorDark").readResolve();
        Lit32 = IntNum.make(new int[]{-16294316});
        Lit31 = (SimpleSymbol) new SimpleSymbol("PrimaryColor").readResolve();
        Lit30 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit29 = (SimpleSymbol) new SimpleSymbol("AppId").readResolve();
        Lit27 = IntNum.make(3);
        Lit26 = (SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve();
        Lit25 = (SimpleSymbol) new SimpleSymbol("any$TextBox$LostFocus").readResolve();
        Lit24 = PairWithPosition.make(Lit336, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit37, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 57487), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 57480), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 57473), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 57462);
        Lit23 = IntNum.make((int) Component.COLOR_LIGHT_GRAY);
        Lit22 = (SimpleSymbol) new SimpleSymbol("any$TextBox$GotFocus").readResolve();
        Lit21 = PairWithPosition.make(Lit336, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit37, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 49293), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 49286), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 49279), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/Screen_SLSInput.yail", 49268);
        Lit20 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit19 = IntNum.make(-1);
        Lit18 = (SimpleSymbol) new SimpleSymbol("$component").readResolve();
        Lit17 = (SimpleSymbol) new SimpleSymbol("SetShape").readResolve();
        Lit16 = (SimpleSymbol) new SimpleSymbol("Decoration1").readResolve();
        Lit15 = (SimpleSymbol) new SimpleSymbol("g$Button").readResolve();
        Lit14 = (SimpleSymbol) new SimpleSymbol("g$Respon").readResolve();
        Lit13 = (SimpleSymbol) new SimpleSymbol("Text_BoxCatatan").readResolve();
        Lit12 = (SimpleSymbol) new SimpleSymbol("Text_BoxRT").readResolve();
        Lit11 = (SimpleSymbol) new SimpleSymbol("Text_BoxHP").readResolve();
        Lit10 = (SimpleSymbol) new SimpleSymbol("Text_BoxLongitude").readResolve();
        Lit9 = (SimpleSymbol) new SimpleSymbol("Text_BoxLatitude").readResolve();
        Lit8 = (SimpleSymbol) new SimpleSymbol("Text_BoxAlamat").readResolve();
        Lit7 = (SimpleSymbol) new SimpleSymbol("Text_BoxNama").readResolve();
        Lit5 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit4 = (SimpleSymbol) new SimpleSymbol("Text_BoxNKS").readResolve();
        Lit3 = (SimpleSymbol) new SimpleSymbol("p$bersih").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("Screen_SLSInput").readResolve();
    }

    public Screen_SLSInput() {
        ModuleInfo.register(this);
        frame frameVar = new frame();
        frameVar.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frameVar, 1, Lit320, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frameVar, 2, Lit321, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frameVar, 3, Lit322, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frameVar, 4, Lit323, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frameVar, 6, Lit324, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frameVar, 7, Lit325, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frameVar, 8, Lit326, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frameVar, 9, Lit327, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frameVar, 10, Lit328, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frameVar, 11, Lit329, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frameVar, 12, Lit330, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frameVar, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frameVar, 14, Lit331, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frameVar, 15, Lit332, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frameVar, 16, Lit333, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frameVar, 17, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime4335152769950135233.scm:615");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frameVar, 18, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frameVar, 19, null, 0);
        lambda$Fn4 = new ModuleMethod(frameVar, 20, null, 0);
        lambda$Fn3 = new ModuleMethod(frameVar, 21, null, 0);
        lambda$Fn5 = new ModuleMethod(frameVar, 22, null, 0);
        lambda$Fn6 = new ModuleMethod(frameVar, 23, null, 0);
        this.any$TextBox$GotFocus = new ModuleMethod(frameVar, 24, Lit22, 8194);
        this.any$TextBox$LostFocus = new ModuleMethod(frameVar, 25, Lit25, 8194);
        lambda$Fn7 = new ModuleMethod(frameVar, 26, null, 0);
        this.Screen_SLSInput$Initialize = new ModuleMethod(frameVar, 27, Lit63, 0);
        lambda$Fn8 = new ModuleMethod(frameVar, 28, null, 0);
        lambda$Fn9 = new ModuleMethod(frameVar, 29, null, 0);
        lambda$Fn10 = new ModuleMethod(frameVar, 30, null, 0);
        lambda$Fn11 = new ModuleMethod(frameVar, 31, null, 0);
        lambda$Fn12 = new ModuleMethod(frameVar, 32, null, 0);
        lambda$Fn13 = new ModuleMethod(frameVar, 33, null, 0);
        lambda$Fn14 = new ModuleMethod(frameVar, 34, null, 0);
        lambda$Fn15 = new ModuleMethod(frameVar, 35, null, 0);
        lambda$Fn16 = new ModuleMethod(frameVar, 36, null, 0);
        lambda$Fn17 = new ModuleMethod(frameVar, 37, null, 0);
        lambda$Fn18 = new ModuleMethod(frameVar, 38, null, 0);
        lambda$Fn19 = new ModuleMethod(frameVar, 39, null, 0);
        lambda$Fn20 = new ModuleMethod(frameVar, 40, null, 0);
        lambda$Fn21 = new ModuleMethod(frameVar, 41, null, 0);
        lambda$Fn22 = new ModuleMethod(frameVar, 42, null, 0);
        lambda$Fn23 = new ModuleMethod(frameVar, 43, null, 0);
        lambda$Fn24 = new ModuleMethod(frameVar, 44, null, 0);
        lambda$Fn25 = new ModuleMethod(frameVar, 45, null, 0);
        lambda$Fn26 = new ModuleMethod(frameVar, 46, null, 0);
        lambda$Fn27 = new ModuleMethod(frameVar, 47, null, 0);
        lambda$Fn28 = new ModuleMethod(frameVar, 48, null, 0);
        lambda$Fn29 = new ModuleMethod(frameVar, 49, null, 0);
        lambda$Fn30 = new ModuleMethod(frameVar, 50, null, 0);
        lambda$Fn31 = new ModuleMethod(frameVar, 51, null, 0);
        lambda$Fn32 = new ModuleMethod(frameVar, 52, null, 0);
        lambda$Fn33 = new ModuleMethod(frameVar, 53, null, 0);
        lambda$Fn34 = new ModuleMethod(frameVar, 54, null, 0);
        lambda$Fn35 = new ModuleMethod(frameVar, 55, null, 0);
        lambda$Fn36 = new ModuleMethod(frameVar, 56, null, 0);
        lambda$Fn37 = new ModuleMethod(frameVar, 57, null, 0);
        this.Text_BoxHP$GotFocus = new ModuleMethod(frameVar, 58, Lit125, 0);
        lambda$Fn38 = new ModuleMethod(frameVar, 59, null, 0);
        lambda$Fn39 = new ModuleMethod(frameVar, 60, null, 0);
        lambda$Fn40 = new ModuleMethod(frameVar, 61, null, 0);
        lambda$Fn41 = new ModuleMethod(frameVar, 62, null, 0);
        lambda$Fn42 = new ModuleMethod(frameVar, 63, null, 0);
        lambda$Fn43 = new ModuleMethod(frameVar, 64, null, 0);
        lambda$Fn44 = new ModuleMethod(frameVar, 65, null, 0);
        lambda$Fn45 = new ModuleMethod(frameVar, 66, null, 0);
        lambda$Fn46 = new ModuleMethod(frameVar, 67, null, 0);
        lambda$Fn47 = new ModuleMethod(frameVar, 68, null, 0);
        lambda$Fn48 = new ModuleMethod(frameVar, 69, null, 0);
        lambda$Fn49 = new ModuleMethod(frameVar, 70, null, 0);
        this.Text_BoxRW$GotFocus = new ModuleMethod(frameVar, 71, Lit150, 0);
        lambda$Fn50 = new ModuleMethod(frameVar, 72, null, 0);
        lambda$Fn51 = new ModuleMethod(frameVar, 73, null, 0);
        lambda$Fn52 = new ModuleMethod(frameVar, 74, null, 0);
        lambda$Fn53 = new ModuleMethod(frameVar, 75, null, 0);
        lambda$Fn54 = new ModuleMethod(frameVar, 76, null, 0);
        lambda$Fn55 = new ModuleMethod(frameVar, 77, null, 0);
        lambda$Fn56 = new ModuleMethod(frameVar, 78, null, 0);
        lambda$Fn57 = new ModuleMethod(frameVar, 79, null, 0);
        lambda$Fn58 = new ModuleMethod(frameVar, 80, null, 0);
        lambda$Fn59 = new ModuleMethod(frameVar, 81, null, 0);
        lambda$Fn60 = new ModuleMethod(frameVar, 82, null, 0);
        lambda$Fn61 = new ModuleMethod(frameVar, 83, null, 0);
        this.ButtonKirim$Click = new ModuleMethod(frameVar, 84, Lit214, 0);
        lambda$Fn62 = new ModuleMethod(frameVar, 85, null, 0);
        lambda$Fn63 = new ModuleMethod(frameVar, 86, null, 0);
        lambda$Fn64 = new ModuleMethod(frameVar, 87, null, 0);
        lambda$Fn65 = new ModuleMethod(frameVar, 88, null, 0);
        this.ButtonSimpan$Click = new ModuleMethod(frameVar, 89, Lit243, 0);
        lambda$Fn66 = new ModuleMethod(frameVar, 90, null, 0);
        lambda$Fn67 = new ModuleMethod(frameVar, 91, null, 0);
        lambda$Fn68 = new ModuleMethod(frameVar, 92, null, 0);
        lambda$Fn69 = new ModuleMethod(frameVar, 93, null, 0);
        this.ButtonKembali$Click = new ModuleMethod(frameVar, 94, Lit254, 0);
        lambda$Fn70 = new ModuleMethod(frameVar, 95, null, 0);
        lambda$Fn71 = new ModuleMethod(frameVar, 96, null, 0);
        lambda$Fn72 = new ModuleMethod(frameVar, 97, null, 0);
        lambda$Fn73 = new ModuleMethod(frameVar, 98, null, 0);
        this.Web1$GotText = new ModuleMethod(frameVar, 99, Lit274, 16388);
        proc$Fn74 = new ModuleMethod(frameVar, 100, Lit334, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Location_Sensor1$LocationChanged = new ModuleMethod(frameVar, 101, Lit299, 16388);
        this.Notifier1$AfterChoosing = new ModuleMethod(frameVar, 102, Lit309, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn75 = new ModuleMethod(frameVar, 103, null, 0);
        lambda$Fn76 = new ModuleMethod(frameVar, 104, null, 0);
        lambda$Fn77 = new ModuleMethod(frameVar, 105, null, 0);
        lambda$Fn78 = new ModuleMethod(frameVar, 106, null, 0);
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
        Screen_SLSInput = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        runtime.$instance.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, lambda$Fn2), $result);
        } else {
            addToGlobalVars(Lit3, lambda$Fn3);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit14, ""), $result);
        } else {
            addToGlobalVars(Lit14, lambda$Fn5);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit15, ""), $result);
        } else {
            addToGlobalVars(Lit15, lambda$Fn6);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addToCurrentFormEnvironment(Lit22, this.any$TextBox$GotFocus), $result);
        } else {
            addToFormEnvironment(Lit22, this.any$TextBox$GotFocus);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addToCurrentFormEnvironment(Lit25, this.any$TextBox$LostFocus), $result);
        } else {
            addToFormEnvironment(Lit25, this.any$TextBox$LostFocus);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit26, Lit27, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit29, "4734536543895552", Lit6);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit30, "SIMPELSP2020LANJUTAN", Lit6);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit31, Lit32, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit33, Lit34, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit35, AlgorithmIdentifiers.NONE, Lit6);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit36, Boolean.TRUE, Lit37);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit38, "SIMPEL SP2020 LANJUTAN", Lit6);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit39, "KOORDINASI SLS", Lit6), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn7));
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit63, this.Screen_SLSInput$Initialize);
        } else {
            addToFormEnvironment(Lit63, this.Screen_SLSInput$Initialize);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Screen_SLSInput", "Initialize");
        } else {
            addToEvents(Lit0, Lit64);
        }
        this.Space1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit65, Lit66, lambda$Fn8), $result);
        } else {
            addToComponents(Lit0, Lit69, Lit66, lambda$Fn9);
        }
        this.Card_View1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit70, Lit71, lambda$Fn10), $result);
        } else {
            addToComponents(Lit0, Lit74, Lit71, lambda$Fn11);
        }
        this.Text_BoxIDSLS = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit71, Lit75, Lit76, lambda$Fn12), $result);
        } else {
            addToComponents(Lit71, Lit80, Lit76, lambda$Fn13);
        }
        this.Label2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit71, Lit81, Lit82, lambda$Fn14), $result);
        } else {
            addToComponents(Lit71, Lit87, Lit82, lambda$Fn15);
        }
        this.Text_BoxNKS = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit71, Lit88, Lit4, lambda$Fn16), $result);
        } else {
            addToComponents(Lit71, Lit92, Lit4, lambda$Fn17);
        }
        this.Text_BoxAlamat = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit71, Lit93, Lit8, lambda$Fn18), $result);
        } else {
            addToComponents(Lit71, Lit94, Lit8, lambda$Fn19);
        }
        this.Text_BoxLatitude = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit71, Lit95, Lit9, lambda$Fn20), $result);
        } else {
            addToComponents(Lit71, Lit96, Lit9, lambda$Fn21);
        }
        this.Text_BoxLongitude = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit71, Lit97, Lit10, lambda$Fn22), $result);
        } else {
            addToComponents(Lit71, Lit98, Lit10, lambda$Fn23);
        }
        this.Google_Maps1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit99, Lit100, lambda$Fn24), $result);
        } else {
            addToComponents(Lit0, Lit102, Lit100, lambda$Fn25);
        }
        this.Card_View2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit103, Lit104, lambda$Fn26), $result);
        } else {
            addToComponents(Lit0, Lit105, Lit104, lambda$Fn27);
        }
        this.Label4 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit104, Lit106, Lit107, lambda$Fn28), $result);
        } else {
            addToComponents(Lit104, Lit109, Lit107, lambda$Fn29);
        }
        this.Text_BoxNama = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit104, Lit110, Lit7, lambda$Fn30), $result);
        } else {
            addToComponents(Lit104, Lit113, Lit7, lambda$Fn31);
        }
        this.Space2_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit104, Lit114, Lit115, lambda$Fn32), $result);
        } else {
            addToComponents(Lit104, Lit117, Lit115, lambda$Fn33);
        }
        this.Label1_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit104, Lit118, Lit119, lambda$Fn34), $result);
        } else {
            addToComponents(Lit104, Lit121, Lit119, lambda$Fn35);
        }
        this.Text_BoxHP = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit104, Lit122, Lit11, lambda$Fn36), $result);
        } else {
            addToComponents(Lit104, Lit123, Lit11, lambda$Fn37);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit125, this.Text_BoxHP$GotFocus);
        } else {
            addToFormEnvironment(Lit125, this.Text_BoxHP$GotFocus);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Text_BoxHP", "GotFocus");
        } else {
            addToEvents(Lit11, Lit126);
        }
        this.Space2_copy1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit104, Lit127, Lit128, lambda$Fn38), $result);
        } else {
            addToComponents(Lit104, Lit130, Lit128, lambda$Fn39);
        }
        this.Label5 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit104, Lit131, Lit132, lambda$Fn40), $result);
        } else {
            addToComponents(Lit104, Lit134, Lit132, lambda$Fn41);
        }
        this.Label5_copy_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit104, Lit135, Lit136, lambda$Fn42), $result);
        } else {
            addToComponents(Lit104, Lit138, Lit136, lambda$Fn43);
        }
        this.Text_BoxRT = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit104, Lit139, Lit12, lambda$Fn44), $result);
        } else {
            addToComponents(Lit104, Lit141, Lit12, lambda$Fn45);
        }
        this.Label5_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit104, Lit142, Lit143, lambda$Fn46), $result);
        } else {
            addToComponents(Lit104, Lit145, Lit143, lambda$Fn47);
        }
        this.Text_BoxRW = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit104, Lit146, Lit54, lambda$Fn48), $result);
        } else {
            addToComponents(Lit104, Lit148, Lit54, lambda$Fn49);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit150, this.Text_BoxRW$GotFocus);
        } else {
            addToFormEnvironment(Lit150, this.Text_BoxRW$GotFocus);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Text_BoxRW", "GotFocus");
        } else {
            addToEvents(Lit54, Lit126);
        }
        this.Space2_copy2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit104, Lit151, Lit152, lambda$Fn50), $result);
        } else {
            addToComponents(Lit104, Lit154, Lit152, lambda$Fn51);
        }
        this.Label1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit104, Lit155, Lit156, lambda$Fn52), $result);
        } else {
            addToComponents(Lit104, Lit158, Lit156, lambda$Fn53);
        }
        this.Text_BoxCatatan = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit104, Lit159, Lit13, lambda$Fn54), $result);
        } else {
            addToComponents(Lit104, Lit162, Lit13, lambda$Fn55);
        }
        this.Space2_copy3_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit163, Lit164, lambda$Fn56), $result);
        } else {
            addToComponents(Lit0, Lit166, Lit164, lambda$Fn57);
        }
        this.Horizontal_ArrangementKirim = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit167, Lit168, lambda$Fn58), $result);
        } else {
            addToComponents(Lit0, Lit169, Lit168, lambda$Fn59);
        }
        this.ButtonKirim = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit168, Lit170, Lit171, lambda$Fn60), $result);
        } else {
            addToComponents(Lit168, Lit175, Lit171, lambda$Fn61);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit214, this.ButtonKirim$Click);
        } else {
            addToFormEnvironment(Lit214, this.ButtonKirim$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ButtonKirim", "Click");
        } else {
            addToEvents(Lit171, Lit215);
        }
        this.Space2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit168, Lit216, Lit217, lambda$Fn62), $result);
        } else {
            addToComponents(Lit168, Lit220, Lit217, lambda$Fn63);
        }
        this.ButtonSimpan = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit168, Lit221, Lit222, lambda$Fn64), $result);
        } else {
            addToComponents(Lit168, Lit224, Lit222, lambda$Fn65);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit243, this.ButtonSimpan$Click);
        } else {
            addToFormEnvironment(Lit243, this.ButtonSimpan$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ButtonSimpan", "Click");
        } else {
            addToEvents(Lit222, Lit215);
        }
        this.Space2_copy5 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit168, Lit244, Lit245, lambda$Fn66), $result);
        } else {
            addToComponents(Lit168, Lit248, Lit245, lambda$Fn67);
        }
        this.ButtonKembali = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit168, Lit249, Lit250, lambda$Fn68), $result);
        } else {
            addToComponents(Lit168, Lit252, Lit250, lambda$Fn69);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit254, this.ButtonKembali$Click);
        } else {
            addToFormEnvironment(Lit254, this.ButtonKembali$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ButtonKembali", "Click");
        } else {
            addToEvents(Lit250, Lit215);
        }
        this.Space2_copy3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit255, Lit256, lambda$Fn70), $result);
        } else {
            addToComponents(Lit0, Lit258, Lit256, lambda$Fn71);
        }
        this.Text_BoxInfo = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit259, Lit193, lambda$Fn72), $result);
        } else {
            addToComponents(Lit0, Lit260, Lit193, lambda$Fn73);
        }
        this.Decoration1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit261, Lit16, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit262, Lit16, Boolean.FALSE);
        }
        this.Web1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit263, Lit199, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit264, Lit199, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit274, this.Web1$GotText);
        } else {
            addToFormEnvironment(Lit274, this.Web1$GotText);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Web1", "GotText");
        } else {
            addToEvents(Lit199, Lit275);
        }
        this.Activity_Starter1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit276, Lit277, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit278, Lit277, Boolean.FALSE);
        }
        this.Tiny_DB1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit279, Lit206, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit280, Lit206, Boolean.FALSE);
        }
        this.Clock1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit281, Lit282, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit283, Lit282, Boolean.FALSE);
        }
        this.Location_Sensor1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit284, Lit285, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit286, Lit285, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit299, this.Location_Sensor1$LocationChanged);
        } else {
            addToFormEnvironment(Lit299, this.Location_Sensor1$LocationChanged);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Location_Sensor1", "LocationChanged");
        } else {
            addToEvents(Lit285, Lit300);
        }
        this.Notifier1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit301, Lit178, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit302, Lit178, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit309, this.Notifier1$AfterChoosing);
        } else {
            addToFormEnvironment(Lit309, this.Notifier1$AfterChoosing);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Notifier1", "AfterChoosing");
        } else {
            addToEvents(Lit178, Lit310);
        }
        this.Tiny_DB2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit311, Lit312, lambda$Fn75), $result);
        } else {
            addToComponents(Lit0, Lit314, Lit312, lambda$Fn76);
        }
        this.Tiny_DB14 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit315, Lit316, lambda$Fn77), $result);
        } else {
            addToComponents(Lit0, Lit317, Lit316, lambda$Fn78);
        }
        this.Network1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit318, Lit195, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit319, Lit195, Boolean.FALSE);
        }
        runtime.initRuntime();
    }

    /* compiled from: Screen_SLSInput.yail */
    /* loaded from: classes.dex */
    public class frame extends ModuleBody {
        Screen_SLSInput $main;

        @Override // gnu.expr.ModuleBody
        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 17:
                    return Screen_SLSInput.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return Screen_SLSInput.lambda3();
                case 20:
                    return Screen_SLSInput.lambda5();
                case 21:
                    return Screen_SLSInput.lambda4();
                case 22:
                    return Screen_SLSInput.lambda6();
                case 23:
                    return Screen_SLSInput.lambda7();
                case 24:
                case 25:
                case 99:
                case 100:
                case 101:
                case 102:
                default:
                    return super.apply0(moduleMethod);
                case 26:
                    return Screen_SLSInput.lambda8();
                case 27:
                    return this.$main.Screen_SLSInput$Initialize();
                case 28:
                    return Screen_SLSInput.lambda9();
                case 29:
                    return Screen_SLSInput.lambda10();
                case 30:
                    return Screen_SLSInput.lambda11();
                case 31:
                    return Screen_SLSInput.lambda12();
                case 32:
                    return Screen_SLSInput.lambda13();
                case 33:
                    return Screen_SLSInput.lambda14();
                case 34:
                    return Screen_SLSInput.lambda15();
                case 35:
                    return Screen_SLSInput.lambda16();
                case 36:
                    return Screen_SLSInput.lambda17();
                case 37:
                    return Screen_SLSInput.lambda18();
                case 38:
                    return Screen_SLSInput.lambda19();
                case 39:
                    return Screen_SLSInput.lambda20();
                case 40:
                    return Screen_SLSInput.lambda21();
                case 41:
                    return Screen_SLSInput.lambda22();
                case 42:
                    return Screen_SLSInput.lambda23();
                case 43:
                    return Screen_SLSInput.lambda24();
                case 44:
                    return Screen_SLSInput.lambda25();
                case 45:
                    return Screen_SLSInput.lambda26();
                case 46:
                    return Screen_SLSInput.lambda27();
                case 47:
                    return Screen_SLSInput.lambda28();
                case 48:
                    return Screen_SLSInput.lambda29();
                case 49:
                    return Screen_SLSInput.lambda30();
                case 50:
                    return Screen_SLSInput.lambda31();
                case 51:
                    return Screen_SLSInput.lambda32();
                case 52:
                    return Screen_SLSInput.lambda33();
                case 53:
                    return Screen_SLSInput.lambda34();
                case 54:
                    return Screen_SLSInput.lambda35();
                case 55:
                    return Screen_SLSInput.lambda36();
                case 56:
                    return Screen_SLSInput.lambda37();
                case 57:
                    return Screen_SLSInput.lambda38();
                case 58:
                    return this.$main.Text_BoxHP$GotFocus();
                case 59:
                    return Screen_SLSInput.lambda39();
                case 60:
                    return Screen_SLSInput.lambda40();
                case 61:
                    return Screen_SLSInput.lambda41();
                case 62:
                    return Screen_SLSInput.lambda42();
                case 63:
                    return Screen_SLSInput.lambda43();
                case 64:
                    return Screen_SLSInput.lambda44();
                case 65:
                    return Screen_SLSInput.lambda45();
                case 66:
                    return Screen_SLSInput.lambda46();
                case 67:
                    return Screen_SLSInput.lambda47();
                case 68:
                    return Screen_SLSInput.lambda48();
                case 69:
                    return Screen_SLSInput.lambda49();
                case 70:
                    return Screen_SLSInput.lambda50();
                case 71:
                    return this.$main.Text_BoxRW$GotFocus();
                case 72:
                    return Screen_SLSInput.lambda51();
                case 73:
                    return Screen_SLSInput.lambda52();
                case 74:
                    return Screen_SLSInput.lambda53();
                case 75:
                    return Screen_SLSInput.lambda54();
                case 76:
                    return Screen_SLSInput.lambda55();
                case 77:
                    return Screen_SLSInput.lambda56();
                case 78:
                    return Screen_SLSInput.lambda57();
                case 79:
                    return Screen_SLSInput.lambda58();
                case 80:
                    return Screen_SLSInput.lambda59();
                case 81:
                    return Screen_SLSInput.lambda60();
                case 82:
                    return Screen_SLSInput.lambda61();
                case 83:
                    return Screen_SLSInput.lambda62();
                case 84:
                    return this.$main.ButtonKirim$Click();
                case 85:
                    return Screen_SLSInput.lambda63();
                case 86:
                    return Screen_SLSInput.lambda64();
                case 87:
                    return Screen_SLSInput.lambda65();
                case 88:
                    return Screen_SLSInput.lambda66();
                case 89:
                    return this.$main.ButtonSimpan$Click();
                case 90:
                    return Screen_SLSInput.lambda67();
                case 91:
                    return Screen_SLSInput.lambda68();
                case 92:
                    return Screen_SLSInput.lambda69();
                case 93:
                    return Screen_SLSInput.lambda70();
                case 94:
                    return this.$main.ButtonKembali$Click();
                case 95:
                    return Screen_SLSInput.lambda71();
                case 96:
                    return Screen_SLSInput.lambda72();
                case 97:
                    return Screen_SLSInput.lambda73();
                case 98:
                    return Screen_SLSInput.lambda74();
                case 103:
                    return Screen_SLSInput.lambda76();
                case 104:
                    return Screen_SLSInput.lambda77();
                case 105:
                    return Screen_SLSInput.lambda78();
                case 106:
                    return Screen_SLSInput.lambda79();
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
                case 25:
                case 99:
                case 100:
                case 101:
                case 102:
                default:
                    return super.match0(moduleMethod, callContext);
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
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
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
                case 103:
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
                case 106:
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
                    if (obj instanceof Screen_SLSInput) {
                        callContext.value1 = obj;
                        callContext.proc = moduleMethod;
                        callContext.pc = 1;
                        return 0;
                    }
                    return -786431;
                case 100:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 102:
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
                case 24:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 25:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
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
                    if (obj instanceof Screen_SLSInput) {
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
                    if (obj instanceof Screen_SLSInput) {
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
                case 99:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 101:
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
                case 100:
                    return Screen_SLSInput.lambda75proc(obj);
                case 102:
                    return this.$main.Notifier1$AfterChoosing(obj);
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
                case 99:
                    return this.$main.Web1$GotText(obj, obj2, obj3, obj4);
                case 101:
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
                case 24:
                    return this.$main.any$TextBox$GotFocus(obj, obj2);
                case 25:
                    return this.$main.any$TextBox$LostFocus(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit4, Lit5, "", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit7, Lit5, "", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit5, "", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit5, "", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit5, "", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit7, Lit5, "", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit5, "", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit5, "", Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit13, Lit5, "", Lit6);
    }

    static Procedure lambda4() {
        return lambda$Fn4;
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit4, Lit5, "", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit7, Lit5, "", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit5, "", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit5, "", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit5, "", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit7, Lit5, "", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit5, "", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit5, "", Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit13, Lit5, "", Lit6);
    }

    static String lambda6() {
        return "";
    }

    static String lambda7() {
        return "";
    }

    public Object any$TextBox$GotFocus(Object $component, Object $notAlreadyHandled) {
        Object $component2 = runtime.sanitizeComponentData($component);
        runtime.sanitizeComponentData($notAlreadyHandled);
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit16, Lit17, LList.list4($component2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit18), " is not bound in the current context"), "Unbound Variable") : $component2, Lit19, Lit20, Boolean.TRUE), Lit21);
    }

    public Object any$TextBox$LostFocus(Object $component, Object $notAlreadyHandled) {
        Object $component2 = runtime.sanitizeComponentData($component);
        runtime.sanitizeComponentData($notAlreadyHandled);
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit16, Lit17, LList.list4($component2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit18), " is not bound in the current context"), "Unbound Variable") : $component2, Lit19, Lit23, Boolean.TRUE), Lit24);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit26, Lit27, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit29, "4734536543895552", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit30, "SIMPELSP2020LANJUTAN", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit31, Lit32, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit33, Lit34, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit35, AlgorithmIdentifiers.NONE, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit36, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit38, "SIMPEL SP2020 LANJUTAN", Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit39, "KOORDINASI SLS", Lit6);
    }

    public Object Screen_SLSInput$Initialize() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit16, Lit17, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit4), Lit19, Lit40, Boolean.TRUE), Lit41);
        runtime.callComponentMethod(Lit16, Lit17, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit8), Lit19, Lit42, Boolean.TRUE), Lit43);
        runtime.callComponentMethod(Lit16, Lit17, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit9), Lit19, Lit44, Boolean.TRUE), Lit45);
        runtime.callComponentMethod(Lit16, Lit17, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit10), Lit19, Lit46, Boolean.TRUE), Lit47);
        runtime.callComponentMethod(Lit16, Lit17, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit7), Lit19, Lit48, Boolean.TRUE), Lit49);
        runtime.callComponentMethod(Lit16, Lit17, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit11), Lit19, Lit50, Boolean.TRUE), Lit51);
        runtime.callComponentMethod(Lit16, Lit17, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit12), Lit19, Lit52, Boolean.TRUE), Lit53);
        runtime.callComponentMethod(Lit16, Lit17, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit54), Lit19, Lit55, Boolean.TRUE), Lit56);
        runtime.callComponentMethod(Lit16, Lit17, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit13), Lit19, Lit57, Boolean.TRUE), Lit58);
        Object $data = runtime.callYailPrimitive(runtime.string$Mnsplit, LList.list2(runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value"), ","), Lit59, "split");
        return runtime.setAndCoerceProperty$Ex(Lit4, Lit5, runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2($data instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit60), " is not bound in the current context"), "Unbound Variable") : $data, Lit61), Lit62, "select list item"), Lit6);
    }

    static Object lambda10() {
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit67, Lit68, Lit28);
    }

    static Object lambda9() {
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit67, Lit68, Lit28);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit71, Lit26, Lit27, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit72, Lit73, Lit28);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit71, Lit26, Lit27, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit72, Lit73, Lit28);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit76, Lit77, "Hint for Text_Box1", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit78, Boolean.TRUE, Lit37);
        return runtime.setAndCoerceProperty$Ex(Lit76, Lit79, Boolean.FALSE, Lit37);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit76, Lit77, "Hint for Text_Box1", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit78, Boolean.TRUE, Lit37);
        return runtime.setAndCoerceProperty$Ex(Lit76, Lit79, Boolean.FALSE, Lit37);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit82, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit82, Lit5, "ID NKS", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit82, Lit84, Lit61, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit82, Lit85, Lit86, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit72, Lit73, Lit28);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit82, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit82, Lit5, "ID NKS", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit82, Lit84, Lit61, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit82, Lit85, Lit86, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit72, Lit73, Lit28);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit4, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit4, Lit89, Lit90, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit4, Lit78, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit4, Lit84, Lit61, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit4, Lit72, Lit91, Lit28);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit4, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit4, Lit89, Lit90, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit4, Lit78, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit4, Lit84, Lit61, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit4, Lit72, Lit91, Lit28);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit8, Lit77, "Alamat Terisi Otomatis", Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit8, Lit78, Boolean.TRUE, Lit37);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit8, Lit77, "Alamat Terisi Otomatis", Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit8, Lit78, Boolean.TRUE, Lit37);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit9, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit77, "Latitude Terisi Otomatis", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit78, Boolean.TRUE, Lit37);
        return runtime.setAndCoerceProperty$Ex(Lit9, Lit84, Lit61, Lit28);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit9, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit77, "Latitude Terisi Otomatis", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit78, Boolean.TRUE, Lit37);
        return runtime.setAndCoerceProperty$Ex(Lit9, Lit84, Lit61, Lit28);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit10, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit77, "Longitude Terisi Otomatis", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit78, Boolean.TRUE, Lit37);
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit84, Lit61, Lit28);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit10, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit77, "Longitude Terisi Otomatis", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit78, Boolean.TRUE, Lit37);
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit84, Lit61, Lit28);
    }

    static Object lambda25() {
        return runtime.setAndCoerceProperty$Ex(Lit100, Lit67, Lit101, Lit28);
    }

    static Object lambda26() {
        return runtime.setAndCoerceProperty$Ex(Lit100, Lit67, Lit101, Lit28);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit104, Lit26, Lit27, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit104, Lit72, Lit73, Lit28);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit104, Lit26, Lit27, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit104, Lit72, Lit73, Lit28);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit107, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit107, Lit5, "Nama Ketua SLS", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit107, Lit84, Lit61, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit107, Lit85, Lit108, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit107, Lit72, Lit73, Lit28);
    }

    static Object lambda30() {
        runtime.setAndCoerceProperty$Ex(Lit107, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit107, Lit5, "Nama Ketua SLS", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit107, Lit84, Lit61, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit107, Lit85, Lit108, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit107, Lit72, Lit73, Lit28);
    }

    static Object lambda31() {
        runtime.setAndCoerceProperty$Ex(Lit7, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit7, Lit111, Lit112, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit7, Lit84, Lit61, Lit28);
    }

    static Object lambda32() {
        runtime.setAndCoerceProperty$Ex(Lit7, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit7, Lit111, Lit112, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit7, Lit84, Lit61, Lit28);
    }

    static Object lambda33() {
        return runtime.setAndCoerceProperty$Ex(Lit115, Lit67, Lit116, Lit28);
    }

    static Object lambda34() {
        return runtime.setAndCoerceProperty$Ex(Lit115, Lit67, Lit116, Lit28);
    }

    static Object lambda35() {
        runtime.setAndCoerceProperty$Ex(Lit119, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit119, Lit5, "NO HP Ketua SLS", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit119, Lit84, Lit61, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit119, Lit85, Lit120, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit119, Lit72, Lit73, Lit28);
    }

    static Object lambda36() {
        runtime.setAndCoerceProperty$Ex(Lit119, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit119, Lit5, "NO HP Ketua SLS", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit119, Lit84, Lit61, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit119, Lit85, Lit120, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit119, Lit72, Lit73, Lit28);
    }

    static Object lambda37() {
        runtime.setAndCoerceProperty$Ex(Lit11, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit111, Lit112, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit89, Lit90, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit11, Lit84, Lit61, Lit28);
    }

    static Object lambda38() {
        runtime.setAndCoerceProperty$Ex(Lit11, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit111, Lit112, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit89, Lit90, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit11, Lit84, Lit61, Lit28);
    }

    public Object Text_BoxHP$GotFocus() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit7, Lit5, runtime.callYailPrimitive(runtime.string$Mnto$Mnupper$Mncase, LList.list1(runtime.get$Mnproperty.apply2(Lit7, Lit5)), Lit124, "upcase"), Lit6);
    }

    static Object lambda39() {
        return runtime.setAndCoerceProperty$Ex(Lit128, Lit67, Lit129, Lit28);
    }

    static Object lambda40() {
        return runtime.setAndCoerceProperty$Ex(Lit128, Lit67, Lit129, Lit28);
    }

    static Object lambda41() {
        runtime.setAndCoerceProperty$Ex(Lit132, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit132, Lit5, "Nama SLS", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit132, Lit84, Lit61, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit132, Lit85, Lit133, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit132, Lit72, Lit73, Lit28);
    }

    static Object lambda42() {
        runtime.setAndCoerceProperty$Ex(Lit132, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit132, Lit5, "Nama SLS", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit132, Lit84, Lit61, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit132, Lit85, Lit133, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit132, Lit72, Lit73, Lit28);
    }

    static Object lambda43() {
        runtime.setAndCoerceProperty$Ex(Lit136, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit136, Lit5, "RT", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit136, Lit84, Lit61, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit136, Lit85, Lit137, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit136, Lit72, Lit73, Lit28);
    }

    static Object lambda44() {
        runtime.setAndCoerceProperty$Ex(Lit136, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit136, Lit5, "RT", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit136, Lit84, Lit61, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit136, Lit85, Lit137, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit136, Lit72, Lit73, Lit28);
    }

    static Object lambda45() {
        runtime.setAndCoerceProperty$Ex(Lit12, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit111, Lit112, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit89, Lit90, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit84, Lit61, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit12, Lit72, Lit140, Lit28);
    }

    static Object lambda46() {
        runtime.setAndCoerceProperty$Ex(Lit12, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit111, Lit112, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit89, Lit90, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit84, Lit61, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit12, Lit72, Lit140, Lit28);
    }

    static Object lambda47() {
        runtime.setAndCoerceProperty$Ex(Lit143, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit5, "RW", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit84, Lit61, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit85, Lit144, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit143, Lit72, Lit73, Lit28);
    }

    static Object lambda48() {
        runtime.setAndCoerceProperty$Ex(Lit143, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit5, "RW", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit84, Lit61, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit85, Lit144, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit143, Lit72, Lit73, Lit28);
    }

    static Object lambda49() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit111, Lit112, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit89, Lit90, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit84, Lit61, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit72, Lit147, Lit28);
    }

    static Object lambda50() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit111, Lit112, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit89, Lit90, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit84, Lit61, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit72, Lit147, Lit28);
    }

    public Object Text_BoxRW$GotFocus() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit76, Lit5, runtime.callYailPrimitive(strings.string$Mnappend, LList.list3(runtime.get$Mnproperty.apply2(Lit4, Lit5), "", runtime.get$Mnproperty.apply2(Lit12, Lit5)), Lit149, "join"), Lit6);
    }

    static Object lambda51() {
        return runtime.setAndCoerceProperty$Ex(Lit152, Lit67, Lit153, Lit28);
    }

    static Object lambda52() {
        return runtime.setAndCoerceProperty$Ex(Lit152, Lit67, Lit153, Lit28);
    }

    static Object lambda53() {
        runtime.setAndCoerceProperty$Ex(Lit156, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit156, Lit5, "Keterangan", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit156, Lit84, Lit61, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit156, Lit85, Lit157, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit156, Lit72, Lit73, Lit28);
    }

    static Object lambda54() {
        runtime.setAndCoerceProperty$Ex(Lit156, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit156, Lit5, "Keterangan", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit156, Lit84, Lit61, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit156, Lit85, Lit157, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit156, Lit72, Lit73, Lit28);
    }

    static Object lambda55() {
        runtime.setAndCoerceProperty$Ex(Lit13, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit111, Lit112, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit160, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit84, Lit61, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit13, Lit72, Lit161, Lit28);
    }

    static Object lambda56() {
        runtime.setAndCoerceProperty$Ex(Lit13, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit111, Lit112, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit160, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit84, Lit61, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit13, Lit72, Lit161, Lit28);
    }

    static Object lambda57() {
        return runtime.setAndCoerceProperty$Ex(Lit164, Lit67, Lit165, Lit28);
    }

    static Object lambda58() {
        return runtime.setAndCoerceProperty$Ex(Lit164, Lit67, Lit165, Lit28);
    }

    static Object lambda59() {
        runtime.setAndCoerceProperty$Ex(Lit168, Lit26, Lit27, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit168, Lit72, Lit73, Lit28);
    }

    static Object lambda60() {
        runtime.setAndCoerceProperty$Ex(Lit168, Lit26, Lit27, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit168, Lit72, Lit73, Lit28);
    }

    static Object lambda61() {
        runtime.setAndCoerceProperty$Ex(Lit171, Lit172, Lit173, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit171, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit171, Lit174, Lit61, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit171, Lit5, "KIRIM", Lit6);
    }

    static Object lambda62() {
        runtime.setAndCoerceProperty$Ex(Lit171, Lit172, Lit173, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit171, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit171, Lit174, Lit61, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit171, Lit5, "KIRIM", Lit6);
    }

    public Object ButtonKirim$Click() {
        Object andCoerceProperty$Ex;
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit13, Lit5, runtime.callYailPrimitive(runtime.string$Mnto$Mnupper$Mncase, LList.list1(runtime.get$Mnproperty.apply2(Lit13, Lit5)), Lit176, "upcase"), Lit6);
        if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit4, Lit5)), Lit177, "is text empty?") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit178, Lit179, LList.list3("ID NKS Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit180);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit9, Lit5)), Lit181, "is text empty?") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit178, Lit179, LList.list3("Koordinat Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit182);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit10, Lit5)), Lit183, "is text empty?") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit178, Lit179, LList.list3("Koordinat Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit184);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit7, Lit5)), Lit185, "is text empty?") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit178, Lit179, LList.list3("Nomor Urut RUTA Sampel Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit186);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit11, Lit5)), Lit187, "is text empty?") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit178, Lit179, LList.list3("Jumlah ART Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit188);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit12, Lit5)), Lit189, "is text empty?") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit178, Lit179, LList.list3("Hasil Kunjungan Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit190);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit54, Lit5)), Lit191, "is text empty?") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit178, Lit179, LList.list3("Jika Hasil Pencacahan TIDAK BERHASIL WAWANCARA LANGSUNG, Catatan Wajib Isi", "Error  !!! Cek Ulang", "OK"), Lit192);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit193, Lit5)), Lit194, "is text empty?") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit193, Lit5, "Data Sudah Di Kirim", Lit6);
        } else if (runtime.callComponentMethod(Lit195, Lit196, LList.Empty, LList.Empty) != Boolean.FALSE) {
            runtime.callComponentMethod(Lit178, Lit197, LList.list2("Sabar Yaaa........", "Sedang Kirim Data!!!"), Lit198);
            runtime.setAndCoerceProperty$Ex(Lit199, Lit200, runtime.callYailPrimitive(runtime.text$Mndeobfuscate, LList.list2("pvmke)7$siczno>dg]NGC\rKT]\u0015LBMYO@\u0017Q\u0016z}UAHB]cxd\t\u007fOr\u000b\n}\f6\n9\n\u0017\u0017v\u0017\u0011\u00164<!\u001c6$\"0\u0005\u0015.\u00192j\f\u0017/\u0012 _.++\fO\u00018T\u0019\u0016X-D\u00110\u001d=!$,]/9I\\\u001b\u0003\u0015\u0000", "hmwvzxrb"), Lit201, "deobfuscate text"), Lit6);
            SimpleSymbol simpleSymbol = Lit199;
            SimpleSymbol simpleSymbol2 = Lit202;
            ModuleMethod moduleMethod = strings.string$Mnappend;
            Pair list1 = LList.list1("action=tambah");
            LList.chain1(LList.chain1(LList.chain1(LList.chain4(LList.chain4(LList.chain4(LList.chain4(list1, "&idnks=", runtime.get$Mnproperty.apply2(Lit4, Lit5), "&alamat=", runtime.get$Mnproperty.apply2(Lit8, Lit5)), "&lat=", runtime.get$Mnproperty.apply2(Lit9, Lit5), "&long=", runtime.get$Mnproperty.apply2(Lit10, Lit5)), "&nama=", runtime.get$Mnproperty.apply2(Lit7, Lit5), "&hp=", runtime.get$Mnproperty.apply2(Lit11, Lit5)), "&rt=", runtime.get$Mnproperty.apply2(Lit12, Lit5), "&rw=", runtime.get$Mnproperty.apply2(Lit54, Lit5)), "&catatan="), runtime.get$Mnproperty.apply2(Lit13, Lit5)), runtime.callYailPrimitive(strings.string$Mnappend, LList.list4("&latilongi=", runtime.get$Mnproperty.apply2(Lit9, Lit5), ",", runtime.get$Mnproperty.apply2(Lit10, Lit5)), Lit203, "join"));
            runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(runtime.callYailPrimitive(moduleMethod, list1, Lit204, "join")), Lit205);
            runtime.callComponentMethod(Lit206, Lit207, LList.list1(runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value")), Lit208);
            SimpleSymbol simpleSymbol3 = Lit206;
            SimpleSymbol simpleSymbol4 = Lit209;
            Object apply2 = runtime.get$Mnproperty.apply2(Lit76, Lit5);
            ModuleMethod moduleMethod2 = runtime.make$Mnyail$Mnlist;
            Pair list12 = LList.list1(runtime.get$Mnproperty.apply2(Lit76, Lit5));
            LList.chain1(LList.chain1(LList.chain4(LList.chain4(list12, runtime.get$Mnproperty.apply2(Lit4, Lit5), runtime.get$Mnproperty.apply2(Lit8, Lit5), runtime.get$Mnproperty.apply2(Lit9, Lit5), runtime.get$Mnproperty.apply2(Lit10, Lit5)), runtime.get$Mnproperty.apply2(Lit7, Lit5), runtime.get$Mnproperty.apply2(Lit11, Lit5), runtime.get$Mnproperty.apply2(Lit12, Lit5), runtime.get$Mnproperty.apply2(Lit54, Lit5)), runtime.get$Mnproperty.apply2(Lit13, Lit5)), runtime.get$Mnproperty.apply2(Lit193, Lit5));
            andCoerceProperty$Ex = runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list2(apply2, runtime.callYailPrimitive(moduleMethod2, list12, Lit210, "make a list")), Lit211);
        } else {
            runtime.callComponentMethod(Lit178, Lit179, LList.list3("Tidak Ada Jaringan, Tidak Dapat Kirim Data", "Tombol Kirim Tidak Berfungsi", "OK"), Lit212);
            andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit171, Lit213, Boolean.FALSE, Lit37);
        }
        return andCoerceProperty$Ex;
    }

    static Object lambda63() {
        runtime.setAndCoerceProperty$Ex(Lit217, Lit67, Lit218, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit217, Lit72, Lit219, Lit28);
    }

    static Object lambda64() {
        runtime.setAndCoerceProperty$Ex(Lit217, Lit67, Lit218, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit217, Lit72, Lit219, Lit28);
    }

    static Object lambda65() {
        runtime.setAndCoerceProperty$Ex(Lit222, Lit172, Lit223, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit222, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit222, Lit174, Lit61, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit222, Lit5, "SIMPAN", Lit6);
    }

    static Object lambda66() {
        runtime.setAndCoerceProperty$Ex(Lit222, Lit172, Lit223, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit222, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit222, Lit174, Lit61, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit222, Lit5, "SIMPAN", Lit6);
    }

    public Object ButtonSimpan$Click() {
        Object callComponentMethod;
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit4, Lit5)), Lit225, "is text empty?") != Boolean.FALSE) {
            callComponentMethod = runtime.callComponentMethod(Lit178, Lit179, LList.list3("ID NKS Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit226);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit9, Lit5)), Lit227, "is text empty?") != Boolean.FALSE) {
            callComponentMethod = runtime.callComponentMethod(Lit178, Lit179, LList.list3("Koordinat Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit228);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit10, Lit5)), Lit229, "is text empty?") != Boolean.FALSE) {
            callComponentMethod = runtime.callComponentMethod(Lit178, Lit179, LList.list3("Koordinat Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit230);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit7, Lit5)), Lit231, "is text empty?") != Boolean.FALSE) {
            callComponentMethod = runtime.callComponentMethod(Lit178, Lit179, LList.list3("Nomor Urut RUTA Sampel Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit232);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit11, Lit5)), Lit233, "is text empty?") != Boolean.FALSE) {
            callComponentMethod = runtime.callComponentMethod(Lit178, Lit179, LList.list3("Jumlah ART Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit234);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit12, Lit5)), Lit235, "is text empty?") != Boolean.FALSE) {
            callComponentMethod = runtime.callComponentMethod(Lit178, Lit179, LList.list3("Hasil Kunjungan Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit236);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit54, Lit5)), Lit237, "is text empty?") != Boolean.FALSE) {
            callComponentMethod = runtime.callComponentMethod(Lit178, Lit179, LList.list3("Jika Hasil Pencacahan TIDAK BERHASIL WAWANCARA LANGSUNG, Catatan Wajib Isi", "Error  !!! Cek Ulang", "OK"), Lit238);
        } else if (runtime.callYailPrimitive(strings.string$Eq$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit193, Lit5), "Data Sudah Di Kirim"), Lit239, "text=") != Boolean.FALSE) {
            callComponentMethod = runtime.setAndCoerceProperty$Ex(Lit193, Lit5, "Data Belum Di Kirim", Lit6);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit193, Lit5)), Lit240, "is text empty?") != Boolean.FALSE) {
            callComponentMethod = runtime.setAndCoerceProperty$Ex(Lit193, Lit5, "Data Belum Di Kirim", Lit6);
        } else {
            SimpleSymbol simpleSymbol = Lit178;
            SimpleSymbol simpleSymbol2 = Lit241;
            Pair list1 = LList.list1("Simpan Data...!!!");
            LList.chain4(list1, "Simpan", "Ya", "Tidak", Boolean.FALSE);
            callComponentMethod = runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit242);
        }
        return callComponentMethod;
    }

    static Object lambda67() {
        runtime.setAndCoerceProperty$Ex(Lit245, Lit67, Lit246, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit245, Lit72, Lit247, Lit28);
    }

    static Object lambda68() {
        runtime.setAndCoerceProperty$Ex(Lit245, Lit67, Lit246, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit245, Lit72, Lit247, Lit28);
    }

    static Object lambda69() {
        runtime.setAndCoerceProperty$Ex(Lit250, Lit172, Lit251, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit250, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit250, Lit174, Lit61, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit250, Lit5, "KEMBALI", Lit6);
    }

    static Object lambda70() {
        runtime.setAndCoerceProperty$Ex(Lit250, Lit172, Lit251, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit250, Lit83, Boolean.TRUE, Lit37);
        runtime.setAndCoerceProperty$Ex(Lit250, Lit174, Lit61, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit250, Lit5, "KEMBALI", Lit6);
    }

    public Object ButtonKembali$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.close$Mnscreen$Mnwith$Mnvalue, LList.list1("Screen_DataSLS"), Lit253, "close screen with value");
    }

    static Object lambda71() {
        return runtime.setAndCoerceProperty$Ex(Lit256, Lit67, Lit257, Lit28);
    }

    static Object lambda72() {
        return runtime.setAndCoerceProperty$Ex(Lit256, Lit67, Lit257, Lit28);
    }

    static Object lambda73() {
        return runtime.setAndCoerceProperty$Ex(Lit193, Lit79, Boolean.FALSE, Lit37);
    }

    static Object lambda74() {
        return runtime.setAndCoerceProperty$Ex(Lit193, Lit79, Boolean.FALSE, Lit37);
    }

    public Object Web1$GotText(Object $url, Object $responseCode, Object $responseType, Object $responseContent) {
        runtime.sanitizeComponentData($url);
        Object $responseCode2 = runtime.sanitizeComponentData($responseCode);
        runtime.sanitizeComponentData($responseType);
        Object $responseContent2 = runtime.sanitizeComponentData($responseContent);
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2($responseCode2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit265), " is not bound in the current context"), "Unbound Variable") : $responseCode2, Lit266), Lit267, "=") != Boolean.FALSE) {
            runtime.addGlobalVarToCurrentFormEnvironment(Lit14, $responseContent2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit268), " is not bound in the current context"), "Unbound Variable") : $responseContent2);
            runtime.callComponentMethod(Lit0, Lit269, LList.Empty, LList.Empty);
            runtime.callComponentMethod(Lit178, Lit270, LList.Empty, LList.Empty);
            SimpleSymbol simpleSymbol = Lit178;
            SimpleSymbol simpleSymbol2 = Lit241;
            Pair list1 = LList.list1($responseContent2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit268), " is not bound in the current context"), "Unbound Variable") : $responseContent2);
            LList.chain4(list1, "Info", "Ok", "", Boolean.FALSE);
            runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit271);
            Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St));
            runtime.callYailPrimitive(runtime.close$Mnscreen$Mnwith$Mnvalue, LList.list1("Screen_DataSLS"), Lit272, "close screen with value");
        }
        runtime.callComponentMethod(Lit178, Lit270, LList.Empty, LList.Empty);
        return runtime.callYailPrimitive(runtime.close$Mnscreen$Mnwith$Mnvalue, LList.list1("Screen_DataSLS"), Lit273, "close screen with value");
    }

    public Object Location_Sensor1$LocationChanged(Object $latitude, Object $longitude, Object $altitude, Object $speed) {
        Object $latitude2 = runtime.sanitizeComponentData($latitude);
        Object $longitude2 = runtime.sanitizeComponentData($longitude);
        runtime.sanitizeComponentData($altitude);
        runtime.sanitizeComponentData($speed);
        runtime.setThisForm();
        ModuleMethod moduleMethod = proc$Fn74;
        runtime.yailForEach(proc$Fn74, runtime.callComponentMethod(Lit100, Lit290, LList.Empty, LList.Empty));
        runtime.callComponentMethod(Lit100, Lit291, LList.list3($latitude2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit292), " is not bound in the current context"), "Unbound Variable") : $latitude2, $longitude2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit293), " is not bound in the current context"), "Unbound Variable") : $longitude2, Lit112), Lit294);
        SimpleSymbol simpleSymbol = Lit100;
        SimpleSymbol simpleSymbol2 = Lit295;
        ModuleMethod moduleMethod2 = strings.string$Mnappend;
        Pair list1 = LList.list1("[");
        LList.chain4(LList.chain4(list1, "{", "lat:", $latitude2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit292), " is not bound in the current context"), "Unbound Variable") : $latitude2, ","), "lng:", $longitude2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit293), " is not bound in the current context"), "Unbound Variable") : $longitude2, "}", "]");
        runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(runtime.callYailPrimitive(moduleMethod2, list1, Lit296, "join")), Lit297);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit5, runtime.get$Mnproperty.apply2(Lit285, Lit298), Lit6);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit5, $latitude2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit292), " is not bound in the current context"), "Unbound Variable") : $latitude2, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit5, $longitude2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit293), " is not bound in the current context"), "Unbound Variable") : $longitude2, Lit6);
    }

    public static Object lambda75proc(Object $item) {
        return runtime.callComponentMethod(Lit100, Lit287, LList.list1($item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit288), " is not bound in the current context"), "Unbound Variable") : $item), Lit289);
    }

    public Object Notifier1$AfterChoosing(Object $choice) {
        Object $choice2 = runtime.sanitizeComponentData($choice);
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2($choice2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit303), " is not bound in the current context"), "Unbound Variable") : $choice2, "Ya"), Lit304, "=") != Boolean.FALSE) {
            SimpleSymbol simpleSymbol = Lit206;
            SimpleSymbol simpleSymbol2 = Lit209;
            Object apply2 = runtime.get$Mnproperty.apply2(Lit76, Lit5);
            ModuleMethod moduleMethod = runtime.make$Mnyail$Mnlist;
            Pair list1 = LList.list1(runtime.get$Mnproperty.apply2(Lit76, Lit5));
            LList.chain1(LList.chain1(LList.chain4(LList.chain4(list1, runtime.get$Mnproperty.apply2(Lit4, Lit5), runtime.get$Mnproperty.apply2(Lit8, Lit5), runtime.get$Mnproperty.apply2(Lit9, Lit5), runtime.get$Mnproperty.apply2(Lit10, Lit5)), runtime.get$Mnproperty.apply2(Lit7, Lit5), runtime.get$Mnproperty.apply2(Lit11, Lit5), runtime.get$Mnproperty.apply2(Lit12, Lit5), runtime.get$Mnproperty.apply2(Lit54, Lit5)), runtime.get$Mnproperty.apply2(Lit13, Lit5)), runtime.get$Mnproperty.apply2(Lit193, Lit5));
            runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list2(apply2, runtime.callYailPrimitive(moduleMethod, list1, Lit305, "make a list")), Lit306);
            Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St));
            runtime.callYailPrimitive(runtime.close$Mnscreen$Mnwith$Mnvalue, LList.list1("Screen_DataSLS"), Lit307, "close screen with value");
        }
        return runtime.callComponentMethod(Lit178, Lit179, LList.list3("Berhasil Simpan Data", "Info...", "OK"), Lit308);
    }

    static Object lambda76() {
        return runtime.setAndCoerceProperty$Ex(Lit312, Lit313, "TinyDB2", Lit6);
    }

    static Object lambda77() {
        return runtime.setAndCoerceProperty$Ex(Lit312, Lit313, "TinyDB2", Lit6);
    }

    static Object lambda78() {
        return runtime.setAndCoerceProperty$Ex(Lit316, Lit313, "TinyDB14", Lit6);
    }

    static Object lambda79() {
        return runtime.setAndCoerceProperty$Ex(Lit316, Lit313, "TinyDB14", Lit6);
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
        Screen_SLSInput = this;
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
