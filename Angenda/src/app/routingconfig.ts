import {Routes} from '@angular/router';
import { AnadirComponent } from './componentes/anadir/anadir.component';
import { DetallarComponent } from './componentes/detallar/detallar.component';
import { ListarComponent } from './componentes/listar/listar.component';

export const appRoutes: Routes=
[
    {path:'',
    component: ListarComponent},

    {path:'detalle/:id',
    component: DetallarComponent},
  
    {path:'anadir/:id',
    component: AnadirComponent},
    {path:'anadir',
    component: AnadirComponent},
 
]