import Userformikform from "./Userformikform";
import { render , screen } from "@testing-library/react";

test('test for userformikfrom file',()=>{render(<Userformikform/>)

expect(screen.getByText(`Technology`)).toBeInTheDocument()});