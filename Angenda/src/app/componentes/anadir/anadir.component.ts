import { Component, OnInit } from '@angular/core';
import{Contacto} from 'src/app/model/contacto';
import{Direccion} from 'src/app/model/direccion';
import{Telefono} from 'src/app/model/telefono';
import{Provincia} from 'src/app/model/provincia';
import { ActivatedRoute } from '@angular/router';
import {ContactotService} from 'src/app/REST/rest';

@Component({
  selector: 'app-anadir',
  templateUrl: './anadir.component.html',
  styleUrls: ['./anadir.component.css']
})
export class AnadirComponent implements OnInit {
  title= 'Anadir';

  contacto: Contacto = new Contacto();
  direccion: Direccion= new Direccion();
  telefonos: Telefono[]= [new Telefono()];
  provincia: Provincia= new Provincia();
  idContacto;
  constructor( private rest:ContactotService, private route: ActivatedRoute){

  }

/**
 * Metodo para añadir el contacto.
 * Llama al metodo anadir(archivo.json) del servicio REST
 */
createContacto():void{
  this.direccion.provincia=this.provincia;
  this.contacto.direccion=this.direccion;
  this.contacto.telefonos=this.telefonos;
  this.rest.anadir(this.contacto)
  .subscribe(data=>{
    alert("Se ha añadido el contacto");
  });
};

  ngOnInit(){
    
    this.route.params.subscribe(params => {
      this.idContacto = +params['id'];
    });
    
    this.rest.detallar(this.idContacto).subscribe(data =>{
      this.contacto=data;
      this.direccion=this.contacto.direccion;
      this.telefonos=this.contacto.telefonos;
      this.provincia=this.direccion.provincia;
    })


    
  }
}