import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FileUploadDetailsComponent } from './file-upload-details.component';

describe('FileUploadDetailsComponent', () => {
  let component: FileUploadDetailsComponent;
  let fixture: ComponentFixture<FileUploadDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FileUploadDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FileUploadDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
