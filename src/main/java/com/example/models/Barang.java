package com.example.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="barang")
public class Barang {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	public String nama_barang;
	public String bagian;
	public Integer kuantitas;
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
	public String getBagian() {
		return bagian;
	}
	public void setBagian(String bagian) {
		this.bagian = bagian;
	}
	public Integer getKuantitas() {
		return kuantitas;
	}
	public void setKuantitas(Integer kuantitas) {
		this.kuantitas = kuantitas;
	}
	
}
