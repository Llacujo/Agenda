import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Contacto} from '../model/contacto';
import {Provincia} from '../model/provincia';

@Injectable()
export class ContactotService {

  public API = '//localhost:8080';
  

  constructor(private http: HttpClient) {}

  // LISTADO
  listar(): Observable<any> {
     
    return this.http.get<Contacto[]>(this.API + '/R');
  }
  detallar(id): Observable<any> {
    
  return this.http.get<Contacto>(this.API + '/detalleR?id='+id);
}
anadir(contacto){
   
        return this.http.post<Contacto>(this.API+'/anadirR', contacto);
      
}
borrar(id){
    return this.http.delete(this.API+'/borrarR?id='+id);
}
listarProvincias(){
    return this.http.get<Provincia[]>(this.API + '/provinciasR');
}
}