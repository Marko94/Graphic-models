package grafickiEditor.actions;

public class Akcije {

	private Cascade cascade;
	private TileHorizontally tilehorizontally;
	private TileVertically tileVertically;
	private NoviDijagram noviDijagram;
	private NoviProjekat noviProjekat;
	private OtvoriProjekatIkonica otvoriProjekatIkonica;
	private OtvoriWorkspaceIkonica otvoriWorkspaceIkonica;
	private PrethodniDijagram prethodniDijagram;
	private SledeciDijagram sledeciDijagram;
	private SacuvajWorkspace sacuvajWorkspace;
	private SacuvajProjekat sacuvajProjekat;
	private SacuvajDijagram sacuvajDijagram;
	private ZatvoriDijagram zatvoriDijagram;
	private ZatvoriSveDijagrame zatvoriSveDijagrame;
	private ZatvoriProjekat zatvoriProjekat;
	private Selekcija selekcija;
	private Pravougaonik pravougaonik;
	private Trougao trougao;
	private Krug krug;
	private IzbrisiDijagram izbirsiDijagram;
	
	public Akcije(){
		cascade = new Cascade();
		tilehorizontally = new TileHorizontally();
		tileVertically = new TileVertically();
		noviDijagram = new NoviDijagram();
		noviProjekat = new NoviProjekat();
		otvoriProjekatIkonica = new OtvoriProjekatIkonica();
		otvoriWorkspaceIkonica = new OtvoriWorkspaceIkonica();
		prethodniDijagram = new PrethodniDijagram();
		sledeciDijagram = new SledeciDijagram();
		sacuvajWorkspace = new SacuvajWorkspace();
		sacuvajProjekat = new SacuvajProjekat();
		sacuvajDijagram = new SacuvajDijagram();
		zatvoriDijagram = new ZatvoriDijagram();
		zatvoriSveDijagrame = new  ZatvoriSveDijagrame();
		zatvoriProjekat = new ZatvoriProjekat();
		selekcija = new Selekcija();
		pravougaonik = new Pravougaonik();
		trougao = new Trougao();
		krug = new Krug();
		izbirsiDijagram = new IzbrisiDijagram();
	}
	

	
	public Cascade getCascade() {
		return cascade;
	}
	public TileHorizontally getTilehorizontally() {
		return tilehorizontally;
	}
	public TileVertically getTileVertically() {
		return tileVertically;
	}
	public NoviDijagram getNoviDijagram() {
		return noviDijagram;
	}
	public NoviProjekat getNoviProjekat() {
		return noviProjekat;
	}
	public OtvoriProjekatIkonica getOtvoriProjekatIkonica() {
		return otvoriProjekatIkonica;
	}
	public OtvoriWorkspaceIkonica getOtvoriWorkspaceIkonica() {
		return otvoriWorkspaceIkonica;
	}
	public PrethodniDijagram getPrethodniDijagram() {
		return prethodniDijagram;
	}
	public SledeciDijagram getSledeciDijagram() {
		return sledeciDijagram;
	}
	public SacuvajWorkspace getSacuvajWorkspace() {
		return sacuvajWorkspace;
	}
	public SacuvajProjekat getSacuvajProjekat() {
		return sacuvajProjekat;
	}
	public SacuvajDijagram getSacuvajDijagram() {
		return sacuvajDijagram;
	}
	public ZatvoriDijagram getZatvoriDijagram() {
		return zatvoriDijagram;
	}
	public ZatvoriSveDijagrame getZatvoriSveDijagrame() {
		return zatvoriSveDijagrame;
	}
	public ZatvoriProjekat getZatvoriProjekat() {
		return zatvoriProjekat;
	}	
	public Selekcija getSelekcija() {
		return selekcija;
	}
	public Pravougaonik getPravougaonik() {
		return pravougaonik;
	}
	public Trougao getTrougao() {
		return trougao;
	}
	public Krug getKrug() {
		return krug;
	}
	public IzbrisiDijagram getIzbrisiDijagram(){
		return izbirsiDijagram;
	}
	
	
}
