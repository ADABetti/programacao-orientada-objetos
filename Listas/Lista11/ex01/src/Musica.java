public class Musica {
  private String titulo;
  private String artista;
  private String album;

  // Constructor:
  public Musica(String titulo, String artista, String album) {
    this.titulo = titulo;
    this.artista = artista;
    this.album = album;
  }

  // Getter and setters:
  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getArtista() {
    return this.artista;
  }

  public void setArtista(String artista) {
    this.artista = artista;
  }

  public String getAlbum() {
    return this.album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  @Override
  public String toString() {
    return String.format(
        """
             Música: {
             título: %s,
             artista: %s,
             album: %s}"
            """, this.titulo, this.artista, this.album);

  }
}
