package com.example.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="peminjaman")
public class Peminjaman {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	public String nama_barang;
	public String nama_peminjam;
	public String lokasi;
	
	@Column(name = "tanggal_peminjaman")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public String tanggal_peminjaman;
    
    @Column(name = "tanggal_pengembalian")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public String tanggal_pengembalian;
	public String keterangan;
	public Integer kuantitas;
	public String status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNama_barang() {
		return nama_barang;
	}
	public void setNama_barang(String nama_barang) {
		this.nama_barang = nama_barang;
	}
	public String getNama_peminjam() {
		return nama_peminjam;
	}
	public void setNama_peminjam(String nama_peminjam) {
		this.nama_peminjam = nama_peminjam;
	}
	public String getLokasi() {
		return lokasi;
	}
	public void setLokasi(String lokasi) {
		this.lokasi = lokasi;
	}
	public String getTanggal_peminjaman() {
		return tanggal_peminjaman;
	}
	public void setTanggal_peminjaman(String tanggal_peminjaman) {
		this.tanggal_peminjaman = tanggal_peminjaman;
	}
	public String getTanggal_pengembalian() {
		return tanggal_pengembalian;
	}
	public void setTanggal_pengembalian(String tanggal_pengembalian) {
		this.tanggal_pengembalian = tanggal_pengembalian;
	}
	public String getKeterangan() {
		return keterangan;
	}
	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}
	public Integer getKuantitas() {
		return kuantitas;
	}
	public void setKuantitas(Integer kuantitas) {
		this.kuantitas = kuantitas;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
