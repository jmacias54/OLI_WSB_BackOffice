/**
 * 
 */
package mx.com.amx.unotv.oli.wsb.backoffice.response;

/**
 * @author Jesus A. Macias Benitez
 *
 */
public class ItemResponse {


	private String fc_id_contenido;
	private String fc_id_categoria;
	private String fc_tipo_nota;
	private String fc_id_class_video;
	private String fc_titulo;
	private String fc_descripcion;
	private String fc_friendy_url;
	private String fc_imagen;
	private String fc_fecha_publicacion;
	private String fc_descripcion_categoria;


	private String fc_autor;
	private String cl_rtf_contenido;
	private String fc_keywords;
	
	private String fc_pie_imagen ; 
	private String fc_id_youtube ; 
	private String fc_id_content_ooyala ; 
	private String fc_id_player_ooyala ; 
	private String cl_galeria;
	
	
	
	/**
	 * 
	 */
	public ItemResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public String getCl_galeria() {
		return cl_galeria;
	}




	public void setCl_galeria(String cl_galeria) {
		this.cl_galeria = cl_galeria;
	}




	public String getFc_pie_imagen() {
		return fc_pie_imagen;
	}




	public void setFc_pie_imagen(String fc_pie_imagen) {
		this.fc_pie_imagen = fc_pie_imagen;
	}




	public String getFc_id_youtube() {
		return fc_id_youtube;
	}




	public void setFc_id_youtube(String fc_id_youtube) {
		this.fc_id_youtube = fc_id_youtube;
	}




	public String getFc_id_content_ooyala() {
		return fc_id_content_ooyala;
	}




	public void setFc_id_content_ooyala(String fc_id_content_ooyala) {
		this.fc_id_content_ooyala = fc_id_content_ooyala;
	}




	public String getFc_id_player_ooyala() {
		return fc_id_player_ooyala;
	}




	public void setFc_id_player_ooyala(String fc_id_player_ooyala) {
		this.fc_id_player_ooyala = fc_id_player_ooyala;
	}




	public String getFc_id_contenido() {
		return fc_id_contenido;
	}
	public void setFc_id_contenido(String fc_id_contenido) {
		this.fc_id_contenido = fc_id_contenido;
	}
	public String getFc_id_categoria() {
		return fc_id_categoria;
	}
	public void setFc_id_categoria(String fc_id_categoria) {
		this.fc_id_categoria = fc_id_categoria;
	}
	public String getFc_tipo_nota() {
		return fc_tipo_nota;
	}
	public void setFc_tipo_nota(String fc_tipo_nota) {
		this.fc_tipo_nota = fc_tipo_nota;
	}
	public String getFc_id_class_video() {
		return fc_id_class_video;
	}
	public void setFc_id_class_video(String fc_id_class_video) {
		this.fc_id_class_video = fc_id_class_video;
	}
	public String getFc_titulo() {
		return fc_titulo;
	}
	public void setFc_titulo(String fc_titulo) {
		this.fc_titulo = fc_titulo;
	}
	public String getFc_descripcion() {
		return fc_descripcion;
	}
	public void setFc_descripcion(String fc_descripcion) {
		this.fc_descripcion = fc_descripcion;
	}
	public String getFc_friendy_url() {
		return fc_friendy_url;
	}
	public void setFc_friendy_url(String fc_friendy_url) {
		this.fc_friendy_url = fc_friendy_url;
	}
	public String getFc_imagen() {
		return fc_imagen;
	}
	public void setFc_imagen(String fc_imagen) {
		this.fc_imagen = fc_imagen;
	}
	public String getFc_fecha_publicacion() {
		return fc_fecha_publicacion;
	}
	public void setFc_fecha_publicacion(String fc_fecha_publicacion) {
		this.fc_fecha_publicacion = fc_fecha_publicacion;
	}
	public String getFc_descripcion_categoria() {
		return fc_descripcion_categoria;
	}
	public void setFc_descripcion_categoria(String fc_descripcion_categoria) {
		this.fc_descripcion_categoria = fc_descripcion_categoria;
	}


	public String getFc_autor() {
		return fc_autor;
	}


	public void setFc_autor(String fc_autor) {
		this.fc_autor = fc_autor;
	}


	public String getCl_rtf_contenido() {
		return cl_rtf_contenido;
	}


	public void setCl_rtf_contenido(String cl_rtf_contenido) {
		this.cl_rtf_contenido = cl_rtf_contenido;
	}


	public String getFc_keywords() {
		return fc_keywords;
	}


	public void setFc_keywords(String fc_keywords) {
		this.fc_keywords = fc_keywords;
	}


	@Override
	public String toString() {
		return "ItemResponse [fc_id_contenido=" + fc_id_contenido + ", fc_id_categoria=" + fc_id_categoria
				+ ", fc_tipo_nota=" + fc_tipo_nota + ", fc_id_class_video=" + fc_id_class_video + ", fc_titulo="
				+ fc_titulo + ", fc_descripcion=" + fc_descripcion + ", fc_friendy_url=" + fc_friendy_url
				+ ", fc_imagen=" + fc_imagen + ", fc_fecha_publicacion=" + fc_fecha_publicacion
				+ ", fc_descripcion_categoria=" + fc_descripcion_categoria + ", fc_autor=" + fc_autor
				+ ", cl_rtf_contenido=" + cl_rtf_contenido + ", fc_keywords=" + fc_keywords + "]";
	}

	
	
	
}
