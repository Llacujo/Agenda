import { Component, OnInit, ViewEncapsulation } from '@angular/core'; //Servicios que voy a utilizar
import { ContactotService } from '../../REST/rest';
import { Contacto } from '../../model/contacto';

@Component({
  selector: 'app-listar', //para embeberlo
  encapsulation: ViewEncapsulation.None,
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css'],
  providers: [ContactotService]  //Aquí meter providers: referencias a las clases del rest
})

export class ListarComponent implements OnInit {

  contactos: Contacto[];   //como el "beers": explicación de clase

  constructor(private contactotservice: ContactotService) {

  }

  ngOnInit() {

    this.contactotservice.listar().subscribe(data => this.success(data), err => this.failed(err)) ;
  }     
    
    
    success(data){
        this.contactos = data;
        console.log("todo ok0000000000000"+this.contactos);
    }

    failed(err){
      console.log("hay un error MUY GRANDE"+err);
    }
}    

