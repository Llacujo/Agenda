import { Component, OnInit } from '@angular/core';
import{Contacto} from 'src/app/model/contacto';
import {ContactotService} from 'src/app/REST/rest';

@Component({
  selector: 'app-anadir',
  templateUrl: './anadir.component.html',
  styleUrls: ['./anadir.component.css']
})
export class AnadirComponent implements OnInit {
  title= 'Anadir';

  contacto: Contacto = new Contacto();

  constructor( private rest:ContactotService){

  }

/**
 * Metodo para añadir el contacto.
 * Llama al metodo anadir(archivo.json) del servicio REST
 */
createContacto():void{
  this.rest.anadir(this.contacto)
  .subscribe(data=>{
    alert("Se ha añadido el contacto");
  });
};

  ngOnInit() {
  }

}
