import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { AgreementComponent } from "./agreement/agreement.component";
import { GetAgreementService } from "./services/get-agreement.service";

const routes: Routes = [
  {
    path: "agreement",
    component: AgreementComponent,
    canActivate: [GetAgreementService]
  },
  { path: "", redirectTo: "agreement", pathMatch: "full" }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
