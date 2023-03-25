package io.kodular.supersugiman.SIMPELSP2020LANJUTAN;

import androidx.core.internal.view.SupportMenu;
import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Decoration;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.MakeroidCardView;
import com.google.appinventor.components.runtime.Network;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.SpaceView;
import com.google.appinventor.components.runtime.TableArrangement;
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
import gnu.kawa.functions.AddOp;
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
import org.slf4j.Marker;
/* compiled from: lfsp2020_p.yail */
/* loaded from: classes.dex */
public class lfsp2020_p extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final IntNum Lit100;
    static final FString Lit101;
    static final FString Lit102;
    static final SimpleSymbol Lit103;
    static final IntNum Lit104;
    static final FString Lit105;
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
    static final IntNum Lit115;
    static final FString Lit116;
    static final FString Lit117;
    static final IntNum Lit118;
    static final FString Lit119;
    static final SimpleSymbol Lit12;
    static final FString Lit120;
    static final SimpleSymbol Lit121;
    static final IntNum Lit122;
    static final FString Lit123;
    static final FString Lit124;
    static final SimpleSymbol Lit125;
    static final IntNum Lit126;
    static final FString Lit127;
    static final FString Lit128;
    static final SimpleSymbol Lit129;
    static final SimpleSymbol Lit13;
    static final SimpleSymbol Lit130;
    static final FString Lit131;
    static final FString Lit132;
    static final SimpleSymbol Lit133;
    static final SimpleSymbol Lit134;
    static final IntNum Lit135;
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
    static final FString Lit149;
    static final SimpleSymbol Lit15;
    static final SimpleSymbol Lit150;
    static final IntNum Lit151;
    static final FString Lit152;
    static final FString Lit153;
    static final IntNum Lit154;
    static final FString Lit155;
    static final FString Lit156;
    static final SimpleSymbol Lit157;
    static final IntNum Lit158;
    static final FString Lit159;
    static final SimpleSymbol Lit16;
    static final FString Lit160;
    static final SimpleSymbol Lit161;
    static final IntNum Lit162;
    static final FString Lit163;
    static final FString Lit164;
    static final SimpleSymbol Lit165;
    static final IntNum Lit166;
    static final FString Lit167;
    static final FString Lit168;
    static final IntNum Lit169;
    static final SimpleSymbol Lit17;
    static final FString Lit170;
    static final FString Lit171;
    static final SimpleSymbol Lit172;
    static final IntNum Lit173;
    static final FString Lit174;
    static final FString Lit175;
    static final SimpleSymbol Lit176;
    static final FString Lit177;
    static final FString Lit178;
    static final SimpleSymbol Lit179;
    static final SimpleSymbol Lit18;
    static final SimpleSymbol Lit180;
    static final IntNum Lit181;
    static final SimpleSymbol Lit182;
    static final IntNum Lit183;
    static final SimpleSymbol Lit184;
    static final FString Lit185;
    static final PairWithPosition Lit186;
    static final SimpleSymbol Lit187;
    static final SimpleSymbol Lit188;
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
    static final PairWithPosition Lit198;
    static final PairWithPosition Lit199;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final PairWithPosition Lit200;
    static final PairWithPosition Lit201;
    static final PairWithPosition Lit202;
    static final PairWithPosition Lit203;
    static final PairWithPosition Lit204;
    static final PairWithPosition Lit205;
    static final PairWithPosition Lit206;
    static final PairWithPosition Lit207;
    static final PairWithPosition Lit208;
    static final PairWithPosition Lit209;
    static final SimpleSymbol Lit21;
    static final PairWithPosition Lit210;
    static final PairWithPosition Lit211;
    static final PairWithPosition Lit212;
    static final PairWithPosition Lit213;
    static final PairWithPosition Lit214;
    static final PairWithPosition Lit215;
    static final SimpleSymbol Lit216;
    static final SimpleSymbol Lit217;
    static final SimpleSymbol Lit218;
    static final PairWithPosition Lit219;
    static final IntNum Lit22;
    static final SimpleSymbol Lit220;
    static final SimpleSymbol Lit221;
    static final PairWithPosition Lit222;
    static final SimpleSymbol Lit223;
    static final PairWithPosition Lit224;
    static final PairWithPosition Lit225;
    static final SimpleSymbol Lit226;
    static final SimpleSymbol Lit227;
    static final PairWithPosition Lit228;
    static final SimpleSymbol Lit229;
    static final SimpleSymbol Lit23;
    static final PairWithPosition Lit230;
    static final PairWithPosition Lit231;
    static final PairWithPosition Lit232;
    static final SimpleSymbol Lit233;
    static final SimpleSymbol Lit234;
    static final SimpleSymbol Lit235;
    static final FString Lit236;
    static final SimpleSymbol Lit237;
    static final IntNum Lit238;
    static final FString Lit239;
    static final SimpleSymbol Lit24;
    static final FString Lit240;
    static final SimpleSymbol Lit241;
    static final IntNum Lit242;
    static final FString Lit243;
    static final PairWithPosition Lit244;
    static final SimpleSymbol Lit245;
    static final FString Lit246;
    static final SimpleSymbol Lit247;
    static final IntNum Lit248;
    static final FString Lit249;
    static final SimpleSymbol Lit25;
    static final FString Lit250;
    static final FString Lit251;
    static final FString Lit252;
    static final FString Lit253;
    static final FString Lit254;
    static final FString Lit255;
    static final SimpleSymbol Lit256;
    static final SimpleSymbol Lit257;
    static final IntNum Lit258;
    static final PairWithPosition Lit259;
    static final SimpleSymbol Lit26;
    static final SimpleSymbol Lit260;
    static final SimpleSymbol Lit261;
    static final SimpleSymbol Lit262;
    static final PairWithPosition Lit263;
    static final PairWithPosition Lit264;
    static final PairWithPosition Lit265;
    static final SimpleSymbol Lit27;
    static final SimpleSymbol Lit28;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final IntNum Lit30;
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
    static final PairWithPosition Lit47;
    static final SimpleSymbol Lit48;
    static final IntNum Lit49;
    static final SimpleSymbol Lit5;
    static final PairWithPosition Lit50;
    static final SimpleSymbol Lit51;
    static final SimpleSymbol Lit52;
    static final FString Lit53;
    static final SimpleSymbol Lit54;
    static final SimpleSymbol Lit55;
    static final IntNum Lit56;
    static final FString Lit57;
    static final FString Lit58;
    static final SimpleSymbol Lit59;
    static final SimpleSymbol Lit6;
    static final SimpleSymbol Lit60;
    static final SimpleSymbol Lit61;
    static final FString Lit62;
    static final FString Lit63;
    static final SimpleSymbol Lit64;
    static final SimpleSymbol Lit65;
    static final SimpleSymbol Lit66;
    static final SimpleSymbol Lit67;
    static final IntNum Lit68;
    static final SimpleSymbol Lit69;
    static final SimpleSymbol Lit7;
    static final IntNum Lit70;
    static final FString Lit71;
    static final FString Lit72;
    static final SimpleSymbol Lit73;
    static final SimpleSymbol Lit74;
    static final IntNum Lit75;
    static final SimpleSymbol Lit76;
    static final IntNum Lit77;
    static final FString Lit78;
    static final FString Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80;
    static final FString Lit81;
    static final FString Lit82;
    static final SimpleSymbol Lit83;
    static final IntNum Lit84;
    static final FString Lit85;
    static final FString Lit86;
    static final SimpleSymbol Lit87;
    static final FString Lit88;
    static final FString Lit89;
    static final SimpleSymbol Lit9;
    static final SimpleSymbol Lit90;
    static final IntNum Lit91;
    static final FString Lit92;
    static final FString Lit93;
    static final SimpleSymbol Lit94;
    static final IntNum Lit95;
    static final IntNum Lit96;
    static final FString Lit97;
    static final FString Lit98;
    static final SimpleSymbol Lit99;
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
    static final ModuleMethod lambda$Fn83 = null;
    static final ModuleMethod lambda$Fn84 = null;
    static final ModuleMethod lambda$Fn85 = null;
    static final ModuleMethod lambda$Fn86 = null;
    static final ModuleMethod lambda$Fn87 = null;
    static final ModuleMethod lambda$Fn88 = null;
    static final ModuleMethod lambda$Fn89 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public static lfsp2020_p lfsp2020_p;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button ButtonCancel;
    public final ModuleMethod ButtonCancel$Click;
    public Button ButtonKirim;
    public final ModuleMethod ButtonKirim$Click;
    public MakeroidCardView Card_View1;
    public Decoration Decoration1;
    public HorizontalArrangement Horizontal_Arrangement2;
    public HorizontalArrangement Horizontal_Arrangement3;
    public Label Label1;
    public Label Label1_copy;
    public Label Label1_copy1;
    public Label Label1_copy2;
    public Label Label1_copy3;
    public Label Label2;
    public Label Label2_copy;
    public Label Label2_copy_copy;
    public Label Label3;
    public Network Network1;
    public Notifier Notifier1;
    public SpaceView Space1;
    public SpaceView Space1_copy;
    public SpaceView Space1_copy1;
    public SpaceView Space1_copy2;
    public SpaceView Space1_copy_copy;
    public SpaceView Space2;
    public SpaceView Space2_copy;
    public SpaceView Space2_copy1;
    public SpaceView Space3;
    public SpaceView Space4;
    public TableArrangement Table_Arrangement1;
    public TextBox Text_Box1;
    public TextBox Text_Box2;
    public TextBox Text_Box3;
    public TextBox Text_Box4a;
    public TextBox Text_Box4b;
    public TextBox Text_Box4c;
    public TextBox Text_Box5;
    public TextBox Text_BoxInfo;
    public TextBox Text_BoxNKS;
    public TinyDB Tiny_DB13;
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
    public final ModuleMethod lfsp2020_p$Initialize;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;
    static final SimpleSymbol Lit288 = (SimpleSymbol) new SimpleSymbol("component").readResolve();
    static final SimpleSymbol Lit287 = (SimpleSymbol) new SimpleSymbol("any").readResolve();
    static final SimpleSymbol Lit286 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
    static final SimpleSymbol Lit285 = (SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve();
    static final SimpleSymbol Lit284 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
    static final SimpleSymbol Lit283 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
    static final SimpleSymbol Lit282 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
    static final SimpleSymbol Lit281 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
    static final SimpleSymbol Lit280 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
    static final SimpleSymbol Lit279 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
    static final SimpleSymbol Lit278 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
    static final SimpleSymbol Lit277 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
    static final SimpleSymbol Lit276 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
    static final SimpleSymbol Lit275 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
    static final SimpleSymbol Lit274 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
    static final SimpleSymbol Lit273 = (SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve();
    static final FString Lit272 = new FString("com.google.appinventor.components.runtime.Network");
    static final FString Lit271 = new FString("com.google.appinventor.components.runtime.Network");
    static final FString Lit270 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final SimpleSymbol Lit269 = (SimpleSymbol) new SimpleSymbol("Namespace").readResolve();
    static final FString Lit268 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final SimpleSymbol Lit267 = (SimpleSymbol) new SimpleSymbol("GotText").readResolve();
    static final SimpleSymbol Lit266 = (SimpleSymbol) new SimpleSymbol("Web1$GotText").readResolve();

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit7 = simpleSymbol;
        Lit265 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1831695), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1831690), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1831684);
        Lit264 = PairWithPosition.make(Lit287, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1831506);
        SimpleSymbol simpleSymbol2 = Lit7;
        SimpleSymbol simpleSymbol3 = Lit7;
        SimpleSymbol simpleSymbol4 = Lit7;
        SimpleSymbol simpleSymbol5 = Lit7;
        SimpleSymbol simpleSymbol6 = (SimpleSymbol) new SimpleSymbol("boolean").readResolve();
        Lit25 = simpleSymbol6;
        Lit263 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, PairWithPosition.make(simpleSymbol6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1831392), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1831387), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1831382), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1831377), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1831371);
        Lit262 = (SimpleSymbol) new SimpleSymbol("ShowChooseDialog").readResolve();
        Lit261 = (SimpleSymbol) new SimpleSymbol("DismissProgressDialog").readResolve();
        Lit260 = (SimpleSymbol) new SimpleSymbol("HideKeyboard").readResolve();
        Lit259 = PairWithPosition.make(Lit287, PairWithPosition.make(Lit287, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1831067), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1831062);
        Lit258 = IntNum.make(200);
        Lit257 = (SimpleSymbol) new SimpleSymbol("$responseCode").readResolve();
        Lit256 = (SimpleSymbol) new SimpleSymbol("$responseContent").readResolve();
        Lit255 = new FString("com.google.appinventor.components.runtime.Web");
        Lit254 = new FString("com.google.appinventor.components.runtime.Web");
        Lit253 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit252 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit251 = new FString("com.google.appinventor.components.runtime.Decoration");
        Lit250 = new FString("com.google.appinventor.components.runtime.Decoration");
        Lit249 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit248 = IntNum.make(-1003);
        Lit247 = (SimpleSymbol) new SimpleSymbol("Space4").readResolve();
        Lit246 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit245 = (SimpleSymbol) new SimpleSymbol("ButtonCancel$Click").readResolve();
        Lit244 = PairWithPosition.make(Lit287, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1732697);
        Lit243 = new FString("com.google.appinventor.components.runtime.Button");
        Lit242 = IntNum.make(new int[]{-17093368});
        Lit241 = (SimpleSymbol) new SimpleSymbol("ButtonCancel").readResolve();
        Lit240 = new FString("com.google.appinventor.components.runtime.Button");
        Lit239 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit238 = IntNum.make(-1010);
        Lit237 = (SimpleSymbol) new SimpleSymbol("Space3").readResolve();
        Lit236 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit235 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit234 = (SimpleSymbol) new SimpleSymbol("ButtonKirim$Click").readResolve();
        Lit233 = (SimpleSymbol) new SimpleSymbol("Enabled").readResolve();
        Lit232 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1640461), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1640456), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1640450);
        Lit231 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit287, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1640276), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1640270);
        Lit230 = PairWithPosition.make(Lit287, PairWithPosition.make(Lit287, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1640247), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1640242);
        Lit229 = (SimpleSymbol) new SimpleSymbol("StoreValue").readResolve();
        Lit228 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1640006);
        Lit227 = (SimpleSymbol) new SimpleSymbol("ClearTag").readResolve();
        Lit226 = (SimpleSymbol) new SimpleSymbol("Tiny_DB13").readResolve();
        Lit225 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639851);
        Lit224 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639834), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639829), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639824), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639819), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639814), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639809), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639804), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639799), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639794), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639789), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639784), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639779), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639774), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639769), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639764), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639759), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639753);
        Lit223 = (SimpleSymbol) new SimpleSymbol("PostText").readResolve();
        Lit222 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639265), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1639259);
        Lit221 = (SimpleSymbol) new SimpleSymbol("Url").readResolve();
        Lit220 = (SimpleSymbol) new SimpleSymbol("Web1").readResolve();
        Lit219 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1638861), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1638855);
        Lit218 = (SimpleSymbol) new SimpleSymbol("ShowProgressDialog").readResolve();
        Lit217 = (SimpleSymbol) new SimpleSymbol("IsConnected").readResolve();
        Lit216 = (SimpleSymbol) new SimpleSymbol("Network1").readResolve();
        Lit215 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1638532);
        Lit214 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1638421), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1638416), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1638410);
        SimpleSymbol simpleSymbol7 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit20 = simpleSymbol7;
        Lit213 = PairWithPosition.make(simpleSymbol7, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1638146), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1638138);
        Lit212 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1638010), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1638005), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1637999);
        Lit211 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1637784), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1637778);
        Lit210 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1637729), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1637721);
        Lit209 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1637533), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1637528), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1637522);
        Lit208 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1637321), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1637313);
        Lit207 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1637209);
        Lit206 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1637089), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1637084), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1637078);
        Lit205 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1636900);
        Lit204 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1636791), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1636786), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1636780);
        Lit203 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1636598), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1636590);
        Lit202 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1636485);
        Lit201 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1636364), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1636359), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1636353);
        Lit200 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1636171), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1636163);
        Lit199 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1636058);
        Lit198 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1635937), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1635932), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1635926);
        Lit197 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1635715), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1635707);
        Lit196 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1635603);
        Lit195 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1635483), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1635478), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1635472);
        Lit194 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1635265), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1635257);
        Lit193 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1635153);
        Lit192 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1635033), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1635028), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1635022);
        Lit191 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1634814), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1634806);
        Lit190 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1634702);
        Lit189 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1634582), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1634577), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1634571);
        Lit188 = (SimpleSymbol) new SimpleSymbol("ShowMessageDialog").readResolve();
        Lit187 = (SimpleSymbol) new SimpleSymbol("Notifier1").readResolve();
        Lit186 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 1634404);
        Lit185 = new FString("com.google.appinventor.components.runtime.Button");
        Lit184 = (SimpleSymbol) new SimpleSymbol("Shape").readResolve();
        Lit183 = IntNum.make(15);
        Lit182 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit181 = IntNum.make(new int[]{Component.COLOR_TEAL});
        Lit180 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit179 = (SimpleSymbol) new SimpleSymbol("ButtonKirim").readResolve();
        Lit178 = new FString("com.google.appinventor.components.runtime.Button");
        Lit177 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit176 = (SimpleSymbol) new SimpleSymbol("Horizontal_Arrangement3").readResolve();
        Lit175 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit174 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit173 = IntNum.make(-1005);
        Lit172 = (SimpleSymbol) new SimpleSymbol("Space1").readResolve();
        Lit171 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit170 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit169 = IntNum.make(-1035);
        Lit168 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit167 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit166 = IntNum.make(-1003);
        Lit165 = (SimpleSymbol) new SimpleSymbol("Space2_copy1").readResolve();
        Lit164 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit163 = new FString("com.google.appinventor.components.runtime.Label");
        Lit162 = IntNum.make(new int[]{-32885510});
        Lit161 = (SimpleSymbol) new SimpleSymbol("Label1").readResolve();
        Lit160 = new FString("com.google.appinventor.components.runtime.Label");
        Lit159 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit158 = IntNum.make(-1005);
        Lit157 = (SimpleSymbol) new SimpleSymbol("Space1_copy2").readResolve();
        Lit156 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit155 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit154 = IntNum.make(-1035);
        Lit153 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit152 = new FString("com.google.appinventor.components.runtime.Label");
        Lit151 = IntNum.make(new int[]{-32885510});
        Lit150 = (SimpleSymbol) new SimpleSymbol("Label2_copy_copy").readResolve();
        Lit149 = new FString("com.google.appinventor.components.runtime.Label");
        Lit148 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit147 = IntNum.make(-1035);
        Lit146 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit145 = new FString("com.google.appinventor.components.runtime.Label");
        Lit144 = IntNum.make(new int[]{-32885510});
        Lit143 = (SimpleSymbol) new SimpleSymbol("Label2_copy").readResolve();
        Lit142 = new FString("com.google.appinventor.components.runtime.Label");
        Lit141 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit140 = IntNum.make(-1035);
        Lit139 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit138 = new FString("com.google.appinventor.components.runtime.Label");
        Lit137 = IntNum.make(new int[]{-32885510});
        Lit136 = (SimpleSymbol) new SimpleSymbol("Row").readResolve();
        Lit135 = IntNum.make(0);
        Lit134 = (SimpleSymbol) new SimpleSymbol("Column").readResolve();
        Lit133 = (SimpleSymbol) new SimpleSymbol("Label2").readResolve();
        Lit132 = new FString("com.google.appinventor.components.runtime.Label");
        Lit131 = new FString("com.google.appinventor.components.runtime.TableArrangement");
        Lit130 = (SimpleSymbol) new SimpleSymbol("Rows").readResolve();
        Lit129 = (SimpleSymbol) new SimpleSymbol("Table_Arrangement1").readResolve();
        Lit128 = new FString("com.google.appinventor.components.runtime.TableArrangement");
        Lit127 = new FString("com.google.appinventor.components.runtime.Label");
        Lit126 = IntNum.make(new int[]{-32885510});
        Lit125 = (SimpleSymbol) new SimpleSymbol("Label1_copy3").readResolve();
        Lit124 = new FString("com.google.appinventor.components.runtime.Label");
        Lit123 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit122 = IntNum.make(-1005);
        Lit121 = (SimpleSymbol) new SimpleSymbol("Space1_copy1").readResolve();
        Lit120 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit119 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit118 = IntNum.make(-1035);
        Lit117 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit116 = new FString("com.google.appinventor.components.runtime.Label");
        Lit115 = IntNum.make(new int[]{-32885510});
        Lit114 = (SimpleSymbol) new SimpleSymbol("Label1_copy2").readResolve();
        Lit113 = new FString("com.google.appinventor.components.runtime.Label");
        Lit112 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit111 = IntNum.make(-1003);
        Lit110 = (SimpleSymbol) new SimpleSymbol("Space2").readResolve();
        Lit109 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit108 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit107 = IntNum.make(-1035);
        Lit106 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit105 = new FString("com.google.appinventor.components.runtime.Label");
        Lit104 = IntNum.make(new int[]{-32885510});
        Lit103 = (SimpleSymbol) new SimpleSymbol("Label1_copy1").readResolve();
        Lit102 = new FString("com.google.appinventor.components.runtime.Label");
        Lit101 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit100 = IntNum.make(-1003);
        Lit99 = (SimpleSymbol) new SimpleSymbol("Space2_copy").readResolve();
        Lit98 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit97 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit96 = IntNum.make(-1035);
        Lit95 = IntNum.make(5);
        Lit94 = (SimpleSymbol) new SimpleSymbol("InputType").readResolve();
        Lit93 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit92 = new FString("com.google.appinventor.components.runtime.Label");
        Lit91 = IntNum.make(new int[]{-32885510});
        Lit90 = (SimpleSymbol) new SimpleSymbol("Label1_copy").readResolve();
        Lit89 = new FString("com.google.appinventor.components.runtime.Label");
        Lit88 = new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit87 = (SimpleSymbol) new SimpleSymbol("Card_View1").readResolve();
        Lit86 = new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit85 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit84 = IntNum.make(-1003);
        Lit83 = (SimpleSymbol) new SimpleSymbol("Space1_copy").readResolve();
        Lit82 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit81 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit80 = (SimpleSymbol) new SimpleSymbol("ReadOnly").readResolve();
        Lit79 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit78 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit77 = IntNum.make(2);
        Lit76 = (SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve();
        Lit75 = IntNum.make(3);
        Lit74 = (SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve();
        Lit73 = (SimpleSymbol) new SimpleSymbol("Horizontal_Arrangement2").readResolve();
        Lit72 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit71 = new FString("com.google.appinventor.components.runtime.Label");
        Lit70 = IntNum.make(-2);
        Lit69 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit68 = IntNum.make(new int[]{-32885510});
        Lit67 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit66 = (SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve();
        Lit65 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        Lit64 = (SimpleSymbol) new SimpleSymbol("Label3").readResolve();
        Lit63 = new FString("com.google.appinventor.components.runtime.Label");
        Lit62 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit61 = (SimpleSymbol) new SimpleSymbol("Visible").readResolve();
        Lit60 = (SimpleSymbol) new SimpleSymbol("Hint").readResolve();
        Lit59 = (SimpleSymbol) new SimpleSymbol("Text_BoxInfo").readResolve();
        Lit58 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit57 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit56 = IntNum.make(-1003);
        Lit55 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit54 = (SimpleSymbol) new SimpleSymbol("Space1_copy_copy").readResolve();
        Lit53 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit52 = (SimpleSymbol) new SimpleSymbol("Initialize").readResolve();
        Lit51 = (SimpleSymbol) new SimpleSymbol("lfsp2020_p$Initialize").readResolve();
        Lit50 = PairWithPosition.make((SimpleSymbol) new SimpleSymbol("list").readResolve(), PairWithPosition.make(Lit20, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99838), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99832);
        Lit49 = IntNum.make(1);
        Lit48 = (SimpleSymbol) new SimpleSymbol("$data").readResolve();
        Lit47 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99680), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99674);
        Lit46 = PairWithPosition.make(Lit288, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99465), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99458), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99451), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99440);
        Lit45 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit44 = PairWithPosition.make(Lit288, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99321), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99314), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99307), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99296);
        Lit43 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit42 = PairWithPosition.make(Lit288, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99176), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99169), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99162), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99151);
        Lit41 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit40 = PairWithPosition.make(Lit288, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99031), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99024), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99017), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 99006);
        Lit39 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit38 = PairWithPosition.make(Lit288, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 98886), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 98879), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 98872), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 98861);
        Lit37 = IntNum.make(-3407872);
        Lit36 = PairWithPosition.make(Lit288, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 98740), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 98733), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 98726), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 98715);
        Lit35 = IntNum.make(-3407872);
        Lit34 = PairWithPosition.make(Lit288, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 98594), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 98587), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 98580), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 98569);
        Lit33 = IntNum.make(-3407872);
        Lit32 = PairWithPosition.make(Lit288, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 98448), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 98441), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 98434), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/lfsp2020_p.yail", 98423);
        Lit31 = IntNum.make(-3407872);
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
        Lit15 = (SimpleSymbol) new SimpleSymbol("g$Button").readResolve();
        Lit14 = (SimpleSymbol) new SimpleSymbol("Text_Box5").readResolve();
        Lit13 = (SimpleSymbol) new SimpleSymbol("Text_Box4c").readResolve();
        Lit12 = (SimpleSymbol) new SimpleSymbol("Text_Box4b").readResolve();
        Lit11 = (SimpleSymbol) new SimpleSymbol("Text_Box4a").readResolve();
        Lit10 = (SimpleSymbol) new SimpleSymbol("Text_Box3").readResolve();
        Lit9 = (SimpleSymbol) new SimpleSymbol("Text_Box2").readResolve();
        Lit8 = (SimpleSymbol) new SimpleSymbol("Text_Box1").readResolve();
        Lit6 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit5 = (SimpleSymbol) new SimpleSymbol("Text_BoxNKS").readResolve();
        Lit4 = (SimpleSymbol) new SimpleSymbol("p$bersih").readResolve();
        Lit3 = (SimpleSymbol) new SimpleSymbol("g$Respon").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("lfsp2020_p").readResolve();
    }

    public lfsp2020_p() {
        ModuleInfo.register(this);
        frame frameVar = new frame();
        frameVar.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frameVar, 1, Lit273, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frameVar, 2, Lit274, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frameVar, 3, Lit275, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frameVar, 4, Lit276, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frameVar, 6, Lit277, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frameVar, 7, Lit278, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frameVar, 8, Lit279, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frameVar, 9, Lit280, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frameVar, 10, Lit281, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frameVar, 11, Lit282, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frameVar, 12, Lit283, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frameVar, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frameVar, 14, Lit284, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frameVar, 15, Lit285, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frameVar, 16, Lit286, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frameVar, 17, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime4335152769950135233.scm:615");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frameVar, 18, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frameVar, 19, null, 0);
        lambda$Fn3 = new ModuleMethod(frameVar, 20, null, 0);
        lambda$Fn5 = new ModuleMethod(frameVar, 21, null, 0);
        lambda$Fn4 = new ModuleMethod(frameVar, 22, null, 0);
        lambda$Fn6 = new ModuleMethod(frameVar, 23, null, 0);
        lambda$Fn7 = new ModuleMethod(frameVar, 24, null, 0);
        this.lfsp2020_p$Initialize = new ModuleMethod(frameVar, 25, Lit51, 0);
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
        lambda$Fn25 = new ModuleMethod(frameVar, 43, null, 0);
        lambda$Fn26 = new ModuleMethod(frameVar, 44, null, 0);
        lambda$Fn27 = new ModuleMethod(frameVar, 45, null, 0);
        lambda$Fn28 = new ModuleMethod(frameVar, 46, null, 0);
        lambda$Fn29 = new ModuleMethod(frameVar, 47, null, 0);
        lambda$Fn30 = new ModuleMethod(frameVar, 48, null, 0);
        lambda$Fn31 = new ModuleMethod(frameVar, 49, null, 0);
        lambda$Fn32 = new ModuleMethod(frameVar, 50, null, 0);
        lambda$Fn33 = new ModuleMethod(frameVar, 51, null, 0);
        lambda$Fn34 = new ModuleMethod(frameVar, 52, null, 0);
        lambda$Fn35 = new ModuleMethod(frameVar, 53, null, 0);
        lambda$Fn36 = new ModuleMethod(frameVar, 54, null, 0);
        lambda$Fn37 = new ModuleMethod(frameVar, 55, null, 0);
        lambda$Fn38 = new ModuleMethod(frameVar, 56, null, 0);
        lambda$Fn39 = new ModuleMethod(frameVar, 57, null, 0);
        lambda$Fn40 = new ModuleMethod(frameVar, 58, null, 0);
        lambda$Fn41 = new ModuleMethod(frameVar, 59, null, 0);
        lambda$Fn42 = new ModuleMethod(frameVar, 60, null, 0);
        lambda$Fn43 = new ModuleMethod(frameVar, 61, null, 0);
        lambda$Fn44 = new ModuleMethod(frameVar, 62, null, 0);
        lambda$Fn45 = new ModuleMethod(frameVar, 63, null, 0);
        lambda$Fn46 = new ModuleMethod(frameVar, 64, null, 0);
        lambda$Fn47 = new ModuleMethod(frameVar, 65, null, 0);
        lambda$Fn48 = new ModuleMethod(frameVar, 66, null, 0);
        lambda$Fn49 = new ModuleMethod(frameVar, 67, null, 0);
        lambda$Fn50 = new ModuleMethod(frameVar, 68, null, 0);
        lambda$Fn51 = new ModuleMethod(frameVar, 69, null, 0);
        lambda$Fn52 = new ModuleMethod(frameVar, 70, null, 0);
        lambda$Fn53 = new ModuleMethod(frameVar, 71, null, 0);
        lambda$Fn54 = new ModuleMethod(frameVar, 72, null, 0);
        lambda$Fn55 = new ModuleMethod(frameVar, 73, null, 0);
        lambda$Fn56 = new ModuleMethod(frameVar, 74, null, 0);
        lambda$Fn57 = new ModuleMethod(frameVar, 75, null, 0);
        lambda$Fn58 = new ModuleMethod(frameVar, 76, null, 0);
        lambda$Fn59 = new ModuleMethod(frameVar, 77, null, 0);
        lambda$Fn60 = new ModuleMethod(frameVar, 78, null, 0);
        lambda$Fn61 = new ModuleMethod(frameVar, 79, null, 0);
        lambda$Fn62 = new ModuleMethod(frameVar, 80, null, 0);
        lambda$Fn63 = new ModuleMethod(frameVar, 81, null, 0);
        lambda$Fn64 = new ModuleMethod(frameVar, 82, null, 0);
        lambda$Fn65 = new ModuleMethod(frameVar, 83, null, 0);
        lambda$Fn66 = new ModuleMethod(frameVar, 84, null, 0);
        lambda$Fn67 = new ModuleMethod(frameVar, 85, null, 0);
        lambda$Fn68 = new ModuleMethod(frameVar, 86, null, 0);
        lambda$Fn69 = new ModuleMethod(frameVar, 87, null, 0);
        lambda$Fn70 = new ModuleMethod(frameVar, 88, null, 0);
        lambda$Fn71 = new ModuleMethod(frameVar, 89, null, 0);
        lambda$Fn72 = new ModuleMethod(frameVar, 90, null, 0);
        lambda$Fn73 = new ModuleMethod(frameVar, 91, null, 0);
        lambda$Fn74 = new ModuleMethod(frameVar, 92, null, 0);
        lambda$Fn75 = new ModuleMethod(frameVar, 93, null, 0);
        lambda$Fn76 = new ModuleMethod(frameVar, 94, null, 0);
        lambda$Fn77 = new ModuleMethod(frameVar, 95, null, 0);
        lambda$Fn78 = new ModuleMethod(frameVar, 96, null, 0);
        lambda$Fn79 = new ModuleMethod(frameVar, 97, null, 0);
        lambda$Fn80 = new ModuleMethod(frameVar, 98, null, 0);
        lambda$Fn81 = new ModuleMethod(frameVar, 99, null, 0);
        this.ButtonKirim$Click = new ModuleMethod(frameVar, 100, Lit234, 0);
        lambda$Fn82 = new ModuleMethod(frameVar, 101, null, 0);
        lambda$Fn83 = new ModuleMethod(frameVar, 102, null, 0);
        lambda$Fn84 = new ModuleMethod(frameVar, 103, null, 0);
        lambda$Fn85 = new ModuleMethod(frameVar, 104, null, 0);
        this.ButtonCancel$Click = new ModuleMethod(frameVar, 105, Lit245, 0);
        lambda$Fn86 = new ModuleMethod(frameVar, 106, null, 0);
        lambda$Fn87 = new ModuleMethod(frameVar, 107, null, 0);
        this.Web1$GotText = new ModuleMethod(frameVar, 108, Lit266, 16388);
        lambda$Fn88 = new ModuleMethod(frameVar, 109, null, 0);
        lambda$Fn89 = new ModuleMethod(frameVar, 110, null, 0);
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
        lfsp2020_p = null;
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
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit15, ""), $result);
        } else {
            addToGlobalVars(Lit15, lambda$Fn6);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit16, "4734536543895552", Lit7);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit17, "SIMPELSP2020LANJUTAN", Lit7);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit18, Lit19, Lit20);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit21, Lit22, Lit20);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit23, AlgorithmIdentifiers.NONE, Lit7);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Boolean.TRUE, Lit25);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit26, "SIMPEL SP2020 LANJUTAN", Lit7);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit27, "LF.SP2020-P", Lit7), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn7));
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit51, this.lfsp2020_p$Initialize);
        } else {
            addToFormEnvironment(Lit51, this.lfsp2020_p$Initialize);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "lfsp2020_p", "Initialize");
        } else {
            addToEvents(Lit0, Lit52);
        }
        this.Space1_copy_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit53, Lit54, lambda$Fn8), $result);
        } else {
            addToComponents(Lit0, Lit57, Lit54, lambda$Fn9);
        }
        this.Text_BoxInfo = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit58, Lit59, lambda$Fn10), $result);
        } else {
            addToComponents(Lit0, Lit62, Lit59, lambda$Fn11);
        }
        this.Label3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit63, Lit64, lambda$Fn12), $result);
        } else {
            addToComponents(Lit0, Lit71, Lit64, lambda$Fn13);
        }
        this.Horizontal_Arrangement2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit72, Lit73, lambda$Fn14), $result);
        } else {
            addToComponents(Lit0, Lit78, Lit73, lambda$Fn15);
        }
        this.Text_BoxNKS = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit73, Lit79, Lit5, lambda$Fn16), $result);
        } else {
            addToComponents(Lit73, Lit81, Lit5, lambda$Fn17);
        }
        this.Space1_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit82, Lit83, lambda$Fn18), $result);
        } else {
            addToComponents(Lit0, Lit85, Lit83, lambda$Fn19);
        }
        this.Card_View1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit86, Lit87, lambda$Fn20), $result);
        } else {
            addToComponents(Lit0, Lit88, Lit87, lambda$Fn21);
        }
        this.Label1_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit87, Lit89, Lit90, lambda$Fn22), $result);
        } else {
            addToComponents(Lit87, Lit92, Lit90, lambda$Fn23);
        }
        this.Text_Box1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit87, Lit93, Lit8, lambda$Fn24), $result);
        } else {
            addToComponents(Lit87, Lit97, Lit8, lambda$Fn25);
        }
        this.Space2_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit87, Lit98, Lit99, lambda$Fn26), $result);
        } else {
            addToComponents(Lit87, Lit101, Lit99, lambda$Fn27);
        }
        this.Label1_copy1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit87, Lit102, Lit103, lambda$Fn28), $result);
        } else {
            addToComponents(Lit87, Lit105, Lit103, lambda$Fn29);
        }
        this.Text_Box2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit87, Lit106, Lit9, lambda$Fn30), $result);
        } else {
            addToComponents(Lit87, Lit108, Lit9, lambda$Fn31);
        }
        this.Space2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit87, Lit109, Lit110, lambda$Fn32), $result);
        } else {
            addToComponents(Lit87, Lit112, Lit110, lambda$Fn33);
        }
        this.Label1_copy2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit87, Lit113, Lit114, lambda$Fn34), $result);
        } else {
            addToComponents(Lit87, Lit116, Lit114, lambda$Fn35);
        }
        this.Text_Box3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit87, Lit117, Lit10, lambda$Fn36), $result);
        } else {
            addToComponents(Lit87, Lit119, Lit10, lambda$Fn37);
        }
        this.Space1_copy1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit87, Lit120, Lit121, lambda$Fn38), $result);
        } else {
            addToComponents(Lit87, Lit123, Lit121, lambda$Fn39);
        }
        this.Label1_copy3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit87, Lit124, Lit125, lambda$Fn40), $result);
        } else {
            addToComponents(Lit87, Lit127, Lit125, lambda$Fn41);
        }
        this.Table_Arrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit87, Lit128, Lit129, lambda$Fn42), $result);
        } else {
            addToComponents(Lit87, Lit131, Lit129, lambda$Fn43);
        }
        this.Label2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit129, Lit132, Lit133, lambda$Fn44), $result);
        } else {
            addToComponents(Lit129, Lit138, Lit133, lambda$Fn45);
        }
        this.Text_Box4b = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit129, Lit139, Lit12, lambda$Fn46), $result);
        } else {
            addToComponents(Lit129, Lit141, Lit12, lambda$Fn47);
        }
        this.Label2_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit129, Lit142, Lit143, lambda$Fn48), $result);
        } else {
            addToComponents(Lit129, Lit145, Lit143, lambda$Fn49);
        }
        this.Text_Box4c = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit129, Lit146, Lit13, lambda$Fn50), $result);
        } else {
            addToComponents(Lit129, Lit148, Lit13, lambda$Fn51);
        }
        this.Label2_copy_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit129, Lit149, Lit150, lambda$Fn52), $result);
        } else {
            addToComponents(Lit129, Lit152, Lit150, lambda$Fn53);
        }
        this.Text_Box4a = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit129, Lit153, Lit11, lambda$Fn54), $result);
        } else {
            addToComponents(Lit129, Lit155, Lit11, lambda$Fn55);
        }
        this.Space1_copy2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit87, Lit156, Lit157, lambda$Fn56), $result);
        } else {
            addToComponents(Lit87, Lit159, Lit157, lambda$Fn57);
        }
        this.Label1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit87, Lit160, Lit161, lambda$Fn58), $result);
        } else {
            addToComponents(Lit87, Lit163, Lit161, lambda$Fn59);
        }
        this.Space2_copy1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit87, Lit164, Lit165, lambda$Fn60), $result);
        } else {
            addToComponents(Lit87, Lit167, Lit165, lambda$Fn61);
        }
        this.Text_Box5 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit87, Lit168, Lit14, lambda$Fn62), $result);
        } else {
            addToComponents(Lit87, Lit170, Lit14, lambda$Fn63);
        }
        this.Space1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit171, Lit172, lambda$Fn64), $result);
        } else {
            addToComponents(Lit0, Lit174, Lit172, lambda$Fn65);
        }
        this.Horizontal_Arrangement3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit175, Lit176, lambda$Fn66), $result);
        } else {
            addToComponents(Lit0, Lit177, Lit176, lambda$Fn67);
        }
        this.ButtonKirim = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit176, Lit178, Lit179, lambda$Fn68), $result);
        } else {
            addToComponents(Lit176, Lit185, Lit179, lambda$Fn69);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit234, this.ButtonKirim$Click);
        } else {
            addToFormEnvironment(Lit234, this.ButtonKirim$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ButtonKirim", "Click");
        } else {
            addToEvents(Lit179, Lit235);
        }
        this.Space3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit176, Lit236, Lit237, lambda$Fn82), $result);
        } else {
            addToComponents(Lit176, Lit239, Lit237, lambda$Fn83);
        }
        this.ButtonCancel = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit176, Lit240, Lit241, lambda$Fn84), $result);
        } else {
            addToComponents(Lit176, Lit243, Lit241, lambda$Fn85);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit245, this.ButtonCancel$Click);
        } else {
            addToFormEnvironment(Lit245, this.ButtonCancel$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ButtonCancel", "Click");
        } else {
            addToEvents(Lit241, Lit235);
        }
        this.Space4 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit246, Lit247, lambda$Fn86), $result);
        } else {
            addToComponents(Lit0, Lit249, Lit247, lambda$Fn87);
        }
        this.Decoration1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit250, Lit28, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit251, Lit28, Boolean.FALSE);
        }
        this.Notifier1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit252, Lit187, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit253, Lit187, Boolean.FALSE);
        }
        this.Web1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit254, Lit220, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit255, Lit220, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit266, this.Web1$GotText);
        } else {
            addToFormEnvironment(Lit266, this.Web1$GotText);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Web1", "GotText");
        } else {
            addToEvents(Lit220, Lit267);
        }
        this.Tiny_DB13 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit268, Lit226, lambda$Fn88), $result);
        } else {
            addToComponents(Lit0, Lit270, Lit226, lambda$Fn89);
        }
        this.Network1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit271, Lit216, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit272, Lit216, Boolean.FALSE);
        }
        runtime.initRuntime();
    }

    /* compiled from: lfsp2020_p.yail */
    /* loaded from: classes.dex */
    public class frame extends ModuleBody {
        lfsp2020_p $main;

        @Override // gnu.expr.ModuleBody
        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 17:
                    return lfsp2020_p.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return lfsp2020_p.lambda3();
                case 20:
                    return lfsp2020_p.lambda4();
                case 21:
                    return lfsp2020_p.lambda6();
                case 22:
                    return lfsp2020_p.lambda5();
                case 23:
                    return lfsp2020_p.lambda7();
                case 24:
                    return lfsp2020_p.lambda8();
                case 25:
                    return this.$main.lfsp2020_p$Initialize();
                case 26:
                    return lfsp2020_p.lambda9();
                case 27:
                    return lfsp2020_p.lambda10();
                case 28:
                    return lfsp2020_p.lambda11();
                case 29:
                    return lfsp2020_p.lambda12();
                case 30:
                    return lfsp2020_p.lambda13();
                case 31:
                    return lfsp2020_p.lambda14();
                case 32:
                    return lfsp2020_p.lambda15();
                case 33:
                    return lfsp2020_p.lambda16();
                case 34:
                    return lfsp2020_p.lambda17();
                case 35:
                    return lfsp2020_p.lambda18();
                case 36:
                    return lfsp2020_p.lambda19();
                case 37:
                    return lfsp2020_p.lambda20();
                case 38:
                    return lfsp2020_p.lambda21();
                case 39:
                    return lfsp2020_p.lambda22();
                case 40:
                    return lfsp2020_p.lambda23();
                case 41:
                    return lfsp2020_p.lambda24();
                case 42:
                    return lfsp2020_p.lambda25();
                case 43:
                    return lfsp2020_p.lambda26();
                case 44:
                    return lfsp2020_p.lambda27();
                case 45:
                    return lfsp2020_p.lambda28();
                case 46:
                    return lfsp2020_p.lambda29();
                case 47:
                    return lfsp2020_p.lambda30();
                case 48:
                    return lfsp2020_p.lambda31();
                case 49:
                    return lfsp2020_p.lambda32();
                case 50:
                    return lfsp2020_p.lambda33();
                case 51:
                    return lfsp2020_p.lambda34();
                case 52:
                    return lfsp2020_p.lambda35();
                case 53:
                    return lfsp2020_p.lambda36();
                case 54:
                    return lfsp2020_p.lambda37();
                case 55:
                    return lfsp2020_p.lambda38();
                case 56:
                    return lfsp2020_p.lambda39();
                case 57:
                    return lfsp2020_p.lambda40();
                case 58:
                    return lfsp2020_p.lambda41();
                case 59:
                    return lfsp2020_p.lambda42();
                case 60:
                    return lfsp2020_p.lambda43();
                case 61:
                    return lfsp2020_p.lambda44();
                case 62:
                    return lfsp2020_p.lambda45();
                case 63:
                    return lfsp2020_p.lambda46();
                case 64:
                    return lfsp2020_p.lambda47();
                case 65:
                    return lfsp2020_p.lambda48();
                case 66:
                    return lfsp2020_p.lambda49();
                case 67:
                    return lfsp2020_p.lambda50();
                case 68:
                    return lfsp2020_p.lambda51();
                case 69:
                    return lfsp2020_p.lambda52();
                case 70:
                    return lfsp2020_p.lambda53();
                case 71:
                    return lfsp2020_p.lambda54();
                case 72:
                    return lfsp2020_p.lambda55();
                case 73:
                    return lfsp2020_p.lambda56();
                case 74:
                    return lfsp2020_p.lambda57();
                case 75:
                    return lfsp2020_p.lambda58();
                case 76:
                    return lfsp2020_p.lambda59();
                case 77:
                    return lfsp2020_p.lambda60();
                case 78:
                    return lfsp2020_p.lambda61();
                case 79:
                    return lfsp2020_p.lambda62();
                case 80:
                    return lfsp2020_p.lambda63();
                case 81:
                    return lfsp2020_p.lambda64();
                case 82:
                    return lfsp2020_p.lambda65();
                case 83:
                    return lfsp2020_p.lambda66();
                case 84:
                    return lfsp2020_p.lambda67();
                case 85:
                    return lfsp2020_p.lambda68();
                case 86:
                    return lfsp2020_p.lambda69();
                case 87:
                    return lfsp2020_p.lambda70();
                case 88:
                    return lfsp2020_p.lambda71();
                case 89:
                    return lfsp2020_p.lambda72();
                case 90:
                    return lfsp2020_p.lambda73();
                case 91:
                    return lfsp2020_p.lambda74();
                case 92:
                    return lfsp2020_p.lambda75();
                case 93:
                    return lfsp2020_p.lambda76();
                case 94:
                    return lfsp2020_p.lambda77();
                case 95:
                    return lfsp2020_p.lambda78();
                case 96:
                    return lfsp2020_p.lambda79();
                case 97:
                    return lfsp2020_p.lambda80();
                case 98:
                    return lfsp2020_p.lambda81();
                case 99:
                    return lfsp2020_p.lambda82();
                case 100:
                    return this.$main.ButtonKirim$Click();
                case 101:
                    return lfsp2020_p.lambda83();
                case 102:
                    return lfsp2020_p.lambda84();
                case 103:
                    return lfsp2020_p.lambda85();
                case 104:
                    return lfsp2020_p.lambda86();
                case 105:
                    return this.$main.ButtonCancel$Click();
                case 106:
                    return lfsp2020_p.lambda87();
                case 107:
                    return lfsp2020_p.lambda88();
                case 108:
                default:
                    return super.apply0(moduleMethod);
                case 109:
                    return lfsp2020_p.lambda89();
                case 110:
                    return lfsp2020_p.lambda90();
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
                case 107:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 108:
                default:
                    return super.match0(moduleMethod, callContext);
                case 109:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 110:
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
                case 3:
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                default:
                    return super.match1(moduleMethod, obj, callContext);
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
                    if (obj instanceof lfsp2020_p) {
                        callContext.value1 = obj;
                        callContext.proc = moduleMethod;
                        callContext.pc = 1;
                        return 0;
                    }
                    return -786431;
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
                    if (obj instanceof lfsp2020_p) {
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
                    if (obj instanceof lfsp2020_p) {
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
                case 3:
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                default:
                    return super.apply1(moduleMethod, obj);
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
                case 108:
                    return this.$main.Web1$GotText(obj, obj2, obj3, obj4);
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
        return runtime.setAndCoerceProperty$Ex(Lit14, Lit6, "", Lit7);
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
        return runtime.setAndCoerceProperty$Ex(Lit14, Lit6, "", Lit7);
    }

    static String lambda7() {
        return "";
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit16, "4734536543895552", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit17, "SIMPELSP2020LANJUTAN", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit18, Lit19, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit21, Lit22, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit23, AlgorithmIdentifiers.NONE, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit26, "SIMPEL SP2020 LANJUTAN", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit27, "LF.SP2020-P", Lit7);
    }

    public Object lfsp2020_p$Initialize() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit28, Lit29, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit5), Lit30, Lit31, Boolean.TRUE), Lit32);
        runtime.callComponentMethod(Lit28, Lit29, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit8), Lit30, Lit33, Boolean.TRUE), Lit34);
        runtime.callComponentMethod(Lit28, Lit29, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit9), Lit30, Lit35, Boolean.TRUE), Lit36);
        runtime.callComponentMethod(Lit28, Lit29, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit10), Lit30, Lit37, Boolean.TRUE), Lit38);
        runtime.callComponentMethod(Lit28, Lit29, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit12), Lit30, Lit39, Boolean.TRUE), Lit40);
        runtime.callComponentMethod(Lit28, Lit29, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit13), Lit30, Lit41, Boolean.TRUE), Lit42);
        runtime.callComponentMethod(Lit28, Lit29, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit11), Lit30, Lit43, Boolean.TRUE), Lit44);
        runtime.callComponentMethod(Lit28, Lit29, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit14), Lit30, Lit45, Boolean.TRUE), Lit46);
        runtime.addGlobalVarToCurrentFormEnvironment(Lit3, "");
        runtime.addGlobalVarToCurrentFormEnvironment(Lit15, "");
        Object $data = runtime.callYailPrimitive(runtime.string$Mnsplit, LList.list2(runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value"), ","), Lit47, "split");
        return runtime.setAndCoerceProperty$Ex(Lit5, Lit6, runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2($data instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit48), " is not bound in the current context"), "Unbound Variable") : $data, Lit49), Lit50, "select list item"), Lit7);
    }

    static Object lambda10() {
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit55, Lit56, Lit20);
    }

    static Object lambda9() {
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit55, Lit56, Lit20);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit59, Lit60, "Hint for Text_Box6", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit59, Lit61, Boolean.FALSE, Lit25);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit59, Lit60, "Hint for Text_Box6", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit59, Lit61, Boolean.FALSE, Lit25);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit64, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit6, "NKS", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit66, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit67, Lit68, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit64, Lit69, Lit70, Lit20);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit64, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit6, "NKS", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit66, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit67, Lit68, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit64, Lit69, Lit70, Lit20);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit73, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit76, Lit77, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit73, Lit69, Lit70, Lit20);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit73, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit76, Lit77, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit73, Lit69, Lit70, Lit20);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit5, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit5, Lit80, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit5, Lit66, Lit49, Lit20);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit5, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit5, Lit80, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit5, Lit66, Lit49, Lit20);
    }

    static Object lambda19() {
        return runtime.setAndCoerceProperty$Ex(Lit83, Lit55, Lit84, Lit20);
    }

    static Object lambda20() {
        return runtime.setAndCoerceProperty$Ex(Lit83, Lit55, Lit84, Lit20);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit87, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit76, Lit77, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit87, Lit69, Lit70, Lit20);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit87, Lit74, Lit75, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit76, Lit77, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit87, Lit69, Lit70, Lit20);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit90, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit90, Lit6, "1. Jumlah Keluarga Sebelum Pemutakhiran", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit90, Lit66, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit90, Lit67, Lit91, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit90, Lit69, Lit70, Lit20);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit90, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit90, Lit6, "1. Jumlah Keluarga Sebelum Pemutakhiran", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit90, Lit66, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit90, Lit67, Lit91, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit90, Lit69, Lit70, Lit20);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit8, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit94, Lit95, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit66, Lit49, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit8, Lit69, Lit96, Lit20);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit8, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit94, Lit95, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit66, Lit49, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit8, Lit69, Lit96, Lit20);
    }

    static Object lambda27() {
        return runtime.setAndCoerceProperty$Ex(Lit99, Lit55, Lit100, Lit20);
    }

    static Object lambda28() {
        return runtime.setAndCoerceProperty$Ex(Lit99, Lit55, Lit100, Lit20);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit103, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit6, "2. Jumlah Keluarga Hasil Pemutakhiran", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit66, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit67, Lit104, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit103, Lit69, Lit70, Lit20);
    }

    static Object lambda30() {
        runtime.setAndCoerceProperty$Ex(Lit103, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit6, "2. Jumlah Keluarga Hasil Pemutakhiran", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit66, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit67, Lit104, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit103, Lit69, Lit70, Lit20);
    }

    static Object lambda31() {
        runtime.setAndCoerceProperty$Ex(Lit9, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit94, Lit95, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit66, Lit49, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit9, Lit69, Lit107, Lit20);
    }

    static Object lambda32() {
        runtime.setAndCoerceProperty$Ex(Lit9, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit94, Lit95, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit9, Lit66, Lit49, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit9, Lit69, Lit107, Lit20);
    }

    static Object lambda33() {
        return runtime.setAndCoerceProperty$Ex(Lit110, Lit55, Lit111, Lit20);
    }

    static Object lambda34() {
        return runtime.setAndCoerceProperty$Ex(Lit110, Lit55, Lit111, Lit20);
    }

    static Object lambda35() {
        runtime.setAndCoerceProperty$Ex(Lit114, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit114, Lit6, "3. Jumlah Rumah Tangga Hasil Pemutakhiran", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit114, Lit66, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit114, Lit67, Lit115, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit114, Lit69, Lit70, Lit20);
    }

    static Object lambda36() {
        runtime.setAndCoerceProperty$Ex(Lit114, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit114, Lit6, "3. Jumlah Rumah Tangga Hasil Pemutakhiran", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit114, Lit66, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit114, Lit67, Lit115, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit114, Lit69, Lit70, Lit20);
    }

    static Object lambda37() {
        runtime.setAndCoerceProperty$Ex(Lit10, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit94, Lit95, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit66, Lit49, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit69, Lit118, Lit20);
    }

    static Object lambda38() {
        runtime.setAndCoerceProperty$Ex(Lit10, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit94, Lit95, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit66, Lit49, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit69, Lit118, Lit20);
    }

    static Object lambda39() {
        return runtime.setAndCoerceProperty$Ex(Lit121, Lit55, Lit122, Lit20);
    }

    static Object lambda40() {
        return runtime.setAndCoerceProperty$Ex(Lit121, Lit55, Lit122, Lit20);
    }

    static Object lambda41() {
        runtime.setAndCoerceProperty$Ex(Lit125, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit125, Lit6, "4. Jumlah ART", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit125, Lit66, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit125, Lit67, Lit126, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit125, Lit69, Lit70, Lit20);
    }

    static Object lambda42() {
        runtime.setAndCoerceProperty$Ex(Lit125, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit125, Lit6, "4. Jumlah ART", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit125, Lit66, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit125, Lit67, Lit126, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit125, Lit69, Lit70, Lit20);
    }

    static Object lambda43() {
        return runtime.setAndCoerceProperty$Ex(Lit129, Lit130, Lit75, Lit20);
    }

    static Object lambda44() {
        return runtime.setAndCoerceProperty$Ex(Lit129, Lit130, Lit75, Lit20);
    }

    static Object lambda45() {
        runtime.setAndCoerceProperty$Ex(Lit133, Lit134, Lit135, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit133, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit133, Lit136, Lit135, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit133, Lit6, "4.a. Laki-laki :", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit133, Lit66, Lit77, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit133, Lit67, Lit137, Lit20);
    }

    static Object lambda46() {
        runtime.setAndCoerceProperty$Ex(Lit133, Lit134, Lit135, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit133, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit133, Lit136, Lit135, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit133, Lit6, "4.a. Laki-laki :", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit133, Lit66, Lit77, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit133, Lit67, Lit137, Lit20);
    }

    static Object lambda47() {
        runtime.setAndCoerceProperty$Ex(Lit12, Lit134, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit94, Lit95, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit136, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit66, Lit49, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit12, Lit69, Lit140, Lit20);
    }

    static Object lambda48() {
        runtime.setAndCoerceProperty$Ex(Lit12, Lit134, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit94, Lit95, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit136, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit66, Lit49, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit12, Lit69, Lit140, Lit20);
    }

    static Object lambda49() {
        runtime.setAndCoerceProperty$Ex(Lit143, Lit134, Lit135, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit136, Lit77, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit6, "4.c. Total :", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit66, Lit77, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit143, Lit67, Lit144, Lit20);
    }

    static Object lambda50() {
        runtime.setAndCoerceProperty$Ex(Lit143, Lit134, Lit135, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit136, Lit77, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit6, "4.c. Total :", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit143, Lit66, Lit77, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit143, Lit67, Lit144, Lit20);
    }

    static Object lambda51() {
        runtime.setAndCoerceProperty$Ex(Lit13, Lit134, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit94, Lit95, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit136, Lit77, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit66, Lit49, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit13, Lit69, Lit147, Lit20);
    }

    static Object lambda52() {
        runtime.setAndCoerceProperty$Ex(Lit13, Lit134, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit94, Lit95, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit136, Lit77, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit66, Lit49, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit13, Lit69, Lit147, Lit20);
    }

    static Object lambda53() {
        runtime.setAndCoerceProperty$Ex(Lit150, Lit134, Lit135, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit150, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit150, Lit136, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit150, Lit6, "4.b. Perempuan :", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit150, Lit66, Lit77, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit150, Lit67, Lit151, Lit20);
    }

    static Object lambda54() {
        runtime.setAndCoerceProperty$Ex(Lit150, Lit134, Lit135, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit150, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit150, Lit136, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit150, Lit6, "4.b. Perempuan :", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit150, Lit66, Lit77, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit150, Lit67, Lit151, Lit20);
    }

    static Object lambda55() {
        runtime.setAndCoerceProperty$Ex(Lit11, Lit134, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit94, Lit95, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit136, Lit135, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit66, Lit49, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit11, Lit69, Lit154, Lit20);
    }

    static Object lambda56() {
        runtime.setAndCoerceProperty$Ex(Lit11, Lit134, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit94, Lit95, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit136, Lit135, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit66, Lit49, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit11, Lit69, Lit154, Lit20);
    }

    static Object lambda57() {
        return runtime.setAndCoerceProperty$Ex(Lit157, Lit55, Lit158, Lit20);
    }

    static Object lambda58() {
        return runtime.setAndCoerceProperty$Ex(Lit157, Lit55, Lit158, Lit20);
    }

    static Object lambda59() {
        runtime.setAndCoerceProperty$Ex(Lit161, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit161, Lit6, "5. Jumlah Rumah Tangga Dengan Kejadian Kematian ", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit161, Lit66, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit161, Lit67, Lit162, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit161, Lit69, Lit70, Lit20);
    }

    static Object lambda60() {
        runtime.setAndCoerceProperty$Ex(Lit161, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit161, Lit6, "5. Jumlah Rumah Tangga Dengan Kejadian Kematian ", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit161, Lit66, Lit49, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit161, Lit67, Lit162, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit161, Lit69, Lit70, Lit20);
    }

    static Object lambda61() {
        return runtime.setAndCoerceProperty$Ex(Lit165, Lit55, Lit166, Lit20);
    }

    static Object lambda62() {
        return runtime.setAndCoerceProperty$Ex(Lit165, Lit55, Lit166, Lit20);
    }

    static Object lambda63() {
        runtime.setAndCoerceProperty$Ex(Lit14, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit14, Lit94, Lit95, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit14, Lit66, Lit49, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit14, Lit69, Lit169, Lit20);
    }

    static Object lambda64() {
        runtime.setAndCoerceProperty$Ex(Lit14, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit14, Lit94, Lit95, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit14, Lit66, Lit49, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit14, Lit69, Lit169, Lit20);
    }

    static Object lambda65() {
        return runtime.setAndCoerceProperty$Ex(Lit172, Lit55, Lit173, Lit20);
    }

    static Object lambda66() {
        return runtime.setAndCoerceProperty$Ex(Lit172, Lit55, Lit173, Lit20);
    }

    static Object lambda67() {
        runtime.setAndCoerceProperty$Ex(Lit176, Lit74, Lit75, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit176, Lit69, Lit70, Lit20);
    }

    static Object lambda68() {
        runtime.setAndCoerceProperty$Ex(Lit176, Lit74, Lit75, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit176, Lit69, Lit70, Lit20);
    }

    static Object lambda69() {
        runtime.setAndCoerceProperty$Ex(Lit179, Lit180, Lit181, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit179, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit179, Lit182, Lit183, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit179, Lit184, Lit49, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit179, Lit6, "KIRIM", Lit7);
    }

    static Object lambda70() {
        runtime.setAndCoerceProperty$Ex(Lit179, Lit180, Lit181, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit179, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit179, Lit182, Lit183, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit179, Lit184, Lit49, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit179, Lit6, "KIRIM", Lit7);
    }

    public Object ButtonKirim$Click() {
        Object andCoerceProperty$Ex;
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit5, Lit6)), Lit186, "is text empty?") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit187, Lit188, LList.list3("ID NKS Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit189);
        } else if (runtime.processOrDelayed$V(new Object[]{lambda$Fn70, lambda$Fn71}) != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit187, Lit188, LList.list3("Rincian 1. Jumlah Keluarga Sebelum Pemutakhiran Tidak Boleh Kosong Atau Minus", "Error  !!! Cek Ulang", "OK"), Lit192);
        } else if (runtime.processOrDelayed$V(new Object[]{lambda$Fn72, lambda$Fn73}) != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit187, Lit188, LList.list3("Rincian 2. Jumlah Keluarga Hasil Pemutakhiran Tidak Boleh Kosong, Atau Minus", "Error  !!! Cek Ulang", "OK"), Lit195);
        } else if (runtime.processOrDelayed$V(new Object[]{lambda$Fn74, lambda$Fn75}) != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit187, Lit188, LList.list3("Rincian 3.Jumlah Rumah Tangga Hasil Pemutakhiran Tidak Boleh Kosong,  Atau Minus", "Error  !!! Cek Ulang", "OK"), Lit198);
        } else if (runtime.processOrDelayed$V(new Object[]{lambda$Fn76, lambda$Fn77}) != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit187, Lit188, LList.list3("Jumlah ART Laki-Laki Tidak Boleh Kosong, Atau Minus", "Error  !!! Cek Ulang", "OK"), Lit201);
        } else if (runtime.processOrDelayed$V(new Object[]{lambda$Fn78, lambda$Fn79}) != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit187, Lit188, LList.list3("Jumlah ART Perempuan Tidak Boleh Kosong, Atau Minus", "Error  !!! Cek Ulang", "OK"), Lit204);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit13, Lit6)), Lit205, "is text empty?") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit187, Lit188, LList.list3("Jumlah ART  Total Tidak Boleh Kosong", "Error  !!! Cek Ulang", "OK"), Lit206);
        } else if (runtime.processOrDelayed$V(new Object[]{lambda$Fn80, lambda$Fn81}) != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit187, Lit188, LList.list3("Jumlah Keluarga Dengan Kejadian Kematian Tidak Boleh Kosong Atau Minus", "Error  !!! Cek Ulang", "OK"), Lit209);
        } else if (runtime.callYailPrimitive(runtime.yail$Mnnot$Mnequal$Qu, LList.list2(runtime.callYailPrimitive(AddOp.$Pl, LList.list2(runtime.get$Mnproperty.apply2(Lit11, Lit6), runtime.get$Mnproperty.apply2(Lit12, Lit6)), Lit210, Marker.ANY_NON_NULL_MARKER), runtime.get$Mnproperty.apply2(Lit13, Lit6)), Lit211, "not =") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit187, Lit188, LList.list3("JMLAH  ART TOTAL Harus Sama Dengan JUMLAH ART LAKI-LAKI Tambah JUMLAH ART PEREMPUAN", "Error  !!! Cek Ulang", "OK"), Lit212);
        } else if (runtime.callYailPrimitive(Scheme.numGrt, LList.list2(runtime.get$Mnproperty.apply2(Lit14, Lit6), runtime.get$Mnproperty.apply2(Lit10, Lit6)), Lit213, ">") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit187, Lit188, LList.list3("Rincian 5. Jumlah Rumah Tangga Dengan Kejadian Kematian Tidak Boleh Lebih Besar Dari Rincian 3. Jumlah Rumah Tangga Hasil Pemutakhiran", "Error  !!! Cek Ulang", "OK"), Lit214);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit59, Lit6)), Lit215, "is text empty?") != Boolean.FALSE) {
            andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit59, Lit6, "Data Sudah Di kirim", Lit7);
        } else if (runtime.callComponentMethod(Lit216, Lit217, LList.Empty, LList.Empty) != Boolean.FALSE) {
            runtime.callComponentMethod(Lit187, Lit218, LList.list2("Sabar Yaaa........", "Sedang Kirim Data!!!"), Lit219);
            runtime.setAndCoerceProperty$Ex(Lit220, Lit221, runtime.callYailPrimitive(runtime.text$Mndeobfuscate, LList.list2("rhsig/1&qgmxli8fecpEA\u000bMV_\u001bB@O_IB\u0015O\bx\u007fSGJ@SY`pvNv\u001a\u0015^x\f!}\u0014&;\"3\u001d<'f7\u001d\u001e<6\u0010\u0016\u001a&\u0001\t#&\u001fdy)\u0000'Y\u0005(\u00007\u0003+\u0005W\u001f/\":\u0002\u0010U\u000f:4\f%$Q. \u001bR\u0013\u0019\u000f\u000f", "hmwvzxrb"), Lit222, "deobfuscate text"), Lit7);
            SimpleSymbol simpleSymbol = Lit220;
            SimpleSymbol simpleSymbol2 = Lit223;
            ModuleMethod moduleMethod = strings.string$Mnappend;
            Pair list1 = LList.list1("action=tambah");
            LList.chain4(LList.chain4(LList.chain4(LList.chain4(list1, "&idnks=", runtime.get$Mnproperty.apply2(Lit5, Lit6), "&p1=", runtime.get$Mnproperty.apply2(Lit8, Lit6)), "&p2=", runtime.get$Mnproperty.apply2(Lit9, Lit6), "&p3=", runtime.get$Mnproperty.apply2(Lit10, Lit6)), "&p4a=", runtime.get$Mnproperty.apply2(Lit11, Lit6), "&p4b=", runtime.get$Mnproperty.apply2(Lit12, Lit6)), "&p4c=", runtime.get$Mnproperty.apply2(Lit13, Lit6), "&p5=", runtime.get$Mnproperty.apply2(Lit14, Lit6));
            runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(runtime.callYailPrimitive(moduleMethod, list1, Lit224, "join")), Lit225);
            runtime.callComponentMethod(Lit226, Lit227, LList.list1(runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value")), Lit228);
            andCoerceProperty$Ex = runtime.callComponentMethod(Lit226, Lit229, LList.list2(runtime.get$Mnproperty.apply2(Lit5, Lit6), runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list2(runtime.get$Mnproperty.apply2(Lit5, Lit6), runtime.get$Mnproperty.apply2(Lit59, Lit6)), Lit230, "make a list")), Lit231);
        } else {
            runtime.callComponentMethod(Lit187, Lit188, LList.list3("Tidak Ada Jaringan, Tidak Dapat Kirim Data", "Tombol Kirim Tidak Berfungsi", "OK"), Lit232);
            andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit179, Lit233, Boolean.FALSE, Lit25);
        }
        return andCoerceProperty$Ex;
    }

    static Object lambda71() {
        return runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit8, Lit6)), Lit190, "is text empty?");
    }

    static Object lambda72() {
        return runtime.callYailPrimitive(Scheme.numLss, LList.list2(runtime.get$Mnproperty.apply2(Lit8, Lit6), Lit135), Lit191, "<");
    }

    static Object lambda73() {
        return runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit9, Lit6)), Lit193, "is text empty?");
    }

    static Object lambda74() {
        return runtime.callYailPrimitive(Scheme.numLss, LList.list2(runtime.get$Mnproperty.apply2(Lit9, Lit6), Lit135), Lit194, "<");
    }

    static Object lambda75() {
        return runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit10, Lit6)), Lit196, "is text empty?");
    }

    static Object lambda76() {
        return runtime.callYailPrimitive(Scheme.numLss, LList.list2(runtime.get$Mnproperty.apply2(Lit10, Lit6), Lit135), Lit197, "<");
    }

    static Object lambda77() {
        return runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit11, Lit6)), Lit199, "is text empty?");
    }

    static Object lambda78() {
        return runtime.callYailPrimitive(Scheme.numLss, LList.list2(runtime.get$Mnproperty.apply2(Lit11, Lit6), Lit135), Lit200, "<");
    }

    static Object lambda79() {
        return runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit12, Lit6)), Lit202, "is text empty?");
    }

    static Object lambda80() {
        return runtime.callYailPrimitive(Scheme.numLss, LList.list2(runtime.get$Mnproperty.apply2(Lit12, Lit6), Lit135), Lit203, "<");
    }

    static Object lambda81() {
        return runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit14, Lit6)), Lit207, "is text empty?");
    }

    static Object lambda82() {
        return runtime.callYailPrimitive(Scheme.numLss, LList.list2(runtime.get$Mnproperty.apply2(Lit14, Lit6), Lit135), Lit208, "<");
    }

    static Object lambda83() {
        return runtime.setAndCoerceProperty$Ex(Lit237, Lit69, Lit238, Lit20);
    }

    static Object lambda84() {
        return runtime.setAndCoerceProperty$Ex(Lit237, Lit69, Lit238, Lit20);
    }

    static Object lambda85() {
        runtime.setAndCoerceProperty$Ex(Lit241, Lit180, Lit242, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit241, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit241, Lit182, Lit183, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit241, Lit184, Lit49, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit241, Lit6, "KEMBALI", Lit7);
    }

    static Object lambda86() {
        runtime.setAndCoerceProperty$Ex(Lit241, Lit180, Lit242, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit241, Lit65, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit241, Lit182, Lit183, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit241, Lit184, Lit49, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit241, Lit6, "KEMBALI", Lit7);
    }

    public Object ButtonCancel$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.close$Mnscreen$Mnwith$Mnvalue, LList.list1("Screen_DataSLS"), Lit244, "close screen with value");
    }

    static Object lambda87() {
        return runtime.setAndCoerceProperty$Ex(Lit247, Lit55, Lit248, Lit20);
    }

    static Object lambda88() {
        return runtime.setAndCoerceProperty$Ex(Lit247, Lit55, Lit248, Lit20);
    }

    public Object Web1$GotText(Object $url, Object $responseCode, Object $responseType, Object $responseContent) {
        Object callComponentMethod;
        runtime.sanitizeComponentData($url);
        Object $responseCode2 = runtime.sanitizeComponentData($responseCode);
        runtime.sanitizeComponentData($responseType);
        Object $responseContent2 = runtime.sanitizeComponentData($responseContent);
        runtime.setThisForm();
        runtime.addGlobalVarToCurrentFormEnvironment(Lit3, $responseContent2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit256), " is not bound in the current context"), "Unbound Variable") : $responseContent2);
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2($responseCode2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit257), " is not bound in the current context"), "Unbound Variable") : $responseCode2, Lit258), Lit259, "=") != Boolean.FALSE) {
            runtime.callComponentMethod(Lit0, Lit260, LList.Empty, LList.Empty);
            runtime.callComponentMethod(Lit187, Lit261, LList.Empty, LList.Empty);
            SimpleSymbol simpleSymbol = Lit187;
            SimpleSymbol simpleSymbol2 = Lit262;
            Pair list1 = LList.list1($responseContent2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit256), " is not bound in the current context"), "Unbound Variable") : $responseContent2);
            LList.chain4(list1, "Info", "Ok", "", Boolean.FALSE);
            runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit263);
            Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St));
            callComponentMethod = runtime.callYailPrimitive(runtime.close$Mnscreen$Mnwith$Mnvalue, LList.list1("Screen_DataSLS"), Lit264, "close screen with value");
        } else {
            callComponentMethod = runtime.callComponentMethod(Lit187, Lit188, LList.list3("Gagal Koneksi, Silahkan Cek Jaringan..... !", "Info", "Ok"), Lit265);
        }
        return callComponentMethod;
    }

    static Object lambda89() {
        return runtime.setAndCoerceProperty$Ex(Lit226, Lit269, "TinyDB13", Lit7);
    }

    static Object lambda90() {
        return runtime.setAndCoerceProperty$Ex(Lit226, Lit269, "TinyDB13", Lit7);
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
        lfsp2020_p = this;
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
