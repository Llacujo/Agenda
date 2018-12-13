import { Component, OnInit} from '@angular/core';
import { Contacto } from '../../model/contacto';
import { ContactotService } from '../../REST/rest';
import { ActivatedRoute, Router } from '@angular/router';
import { Direccion } from 'src/app/model/direccion';
import { Telefono } from 'src/app/model/telefono';
import { Provincia } from 'src/app/model/provincia';

@Component({
  selector: 'app-detallar',
  templateUrl: './detallar.component.html',
  styleUrls: ['./detallar.component.css']
})
export class DetallarComponent implements OnInit {
 
  contacto : Contacto = new Contacto();
  direccion: Direccion = new Direccion();
  provincia : Provincia = new Provincia();
  telefonos : Array<Telefono> = new Array;
  id;

  constructor( private restService : ContactotService, private route: ActivatedRoute, private ruta: Router) {}


  ngOnInit() {
    this.route.params.subscribe(params => {
      this.id = +params['id'];
        });
        this.direccion.provincia = this.provincia;
        this.contacto.direccion = this.direccion;
        this.contacto.telefonos = this.telefonos;
     this.detallar();

 };

 detallar(): void {
  this.restService.detallar(this.id).
  subscribe( data => {
       this.contacto = data;
      });
};
 

borrar(contacto : Contacto): void {
 this.restService.borrar(contacto.idContacto)
      .subscribe( data => {
      });
      
      this.ruta.navigate([""]);

}

}
