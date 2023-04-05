import Userformikform from "./Userformikform";
import { render , screen } from "@testing-library/react";

test('test for userformikfrom file',()=>{render(<Userformikform/>)
const var1=screen.getByText("Hello");
expect(var1).toBeInTheDocument()});