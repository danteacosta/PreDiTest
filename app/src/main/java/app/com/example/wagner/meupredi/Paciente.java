package app.com.example.wagner.meupredi;

import java.io.Serializable;

/**
 * Created by wagne on 31/03/2017.
 */

public class Paciente implements Serializable{

    int _id;
    String _nome;
    String _senha;
    String _email;
    int _idade;
    double _circunferencia;
    double _peso;
    double _altura;
    double _pesoAtual;
    double _imc;
    double _hba1c;
    double _glicosejejum;
    double _glicose75g;
    double _glicosecasual;

    // CONSTRUTOR VAZIO
    public Paciente(){


    }

    public Paciente(int id, String nome, String senha, String email, int idade, double circunferencia, double peso, double altura){
        this._id = id;
        this._nome = nome;
        this._senha = senha;
        this._email = email;
        this._idade = idade;
        this._circunferencia = circunferencia;
        this._peso = peso;
        this._altura = altura;
        this._imc = 20;
        this._hba1c = 0;
        this._glicose75g = 0;
        this._glicosejejum = 0;
        this._glicosecasual = 0;

    }

    public double get_pesoAtual() {
        return _pesoAtual;
    }

    public void set_pesoAtual(double _pesoAtual) {
        this._pesoAtual = _pesoAtual;
    }

    public double get_imc() {
        return _imc;
    }

    public void set_imc(double _imc) {
        this._imc = _imc;
    }

    public double get_hba1c() {
        return _hba1c;
    }

    public void set_hba1c(double _hba1c) {
        this._hba1c = _hba1c;
    }

    public double get_glicosejejum() {
        return _glicosejejum;
    }

    public void set_glicosejejum(double _glicosejejum) {
        this._glicosejejum = _glicosejejum;
    }

    public double get_glicose75g() {
        return _glicose75g;
    }

    public void set_glicose75g(double _glicose75g) {
        this._glicose75g = _glicose75g;
    }

    public double get_glicosecasual() {
        return _glicosecasual;
    }

    public void set_glicosecasual(double _glicosecasual) {
        this._glicosecasual = _glicosecasual;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_nome() {
        return _nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }

    public String get_senha() {
        return _senha;
    }

    public void set_senha(String _senha) {
        this._senha = _senha;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public int get_idade() {
        return _idade;
    }

    public void set_idade(int _idade) {
        this._idade = _idade;
    }

    public double get_circunferencia() {
        return _circunferencia;
    }

    public void set_circunferencia(double _circunferencia) {
        this._circunferencia = _circunferencia;
    }

    public double get_peso() {
        return _peso;
    }

    public void set_peso(double _peso) {
        this._peso = _peso;
    }

    public double get_altura() {
        return _altura;
    }

    public void set_altura(double _altura) {
        this._altura = _altura;
    }
}
