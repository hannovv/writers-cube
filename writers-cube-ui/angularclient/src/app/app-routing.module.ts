import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { CreatestoryboardComponent } from './components/createstoryboard/createstoryboard.component';
import { ViewstoryboardsComponent } from './components/viewstoryboards/viewstoryboards.component';
import { Storyboard } from './models/storyboard';
import { StoryboardComponent } from './components/storyboard/storyboard.component';
const routes: Routes = [ 
  { path: '', component: DashboardComponent},
  { path: 'createstoryboard', component: CreatestoryboardComponent},
  { path: 'viewstoryboards', component: ViewstoryboardsComponent},
  { path: 'storyboard/:id', component: StoryboardComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
  
 }
